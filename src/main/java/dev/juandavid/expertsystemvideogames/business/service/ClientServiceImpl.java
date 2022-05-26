package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.business.exception.ApiRequestException;
import dev.juandavid.expertsystemvideogames.model.dto.JwtDto;
import dev.juandavid.expertsystemvideogames.model.dto.MessageDto;
import dev.juandavid.expertsystemvideogames.model.entities.Client;
import dev.juandavid.expertsystemvideogames.model.entities.Rol;
import dev.juandavid.expertsystemvideogames.model.enums.RolName;
import dev.juandavid.expertsystemvideogames.model.repositories.ClientRepository;
import dev.juandavid.expertsystemvideogames.security.jwt.JwtProvider;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final static String USER_NOT_FOUND_MSG="Usuario no encontrado %s not found";
    private final AuthenticationManager authenticationManager;
    private final ClientRepository clientRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;
    private final RolService rolService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return (UserDetails) clientRepository.findByEmail(email)
                .orElseThrow(()->
                        new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }

    @Override
    public ResponseEntity<Client> showClient(String request) {
        return null;
    }

    @Override
    public ResponseEntity<JwtDto> saveNewClient(Client client) {
        if(clientRepository.findByEmail(client.getEmail()).isPresent()){
            throw new ApiRequestException("Email ya tomado");
        }
        client.setPassword(passwordEncoder.encode(client.getPassword()));
        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolName(RolName.ROLE_USER).get());
        client.setRols(roles);
        clientRepository.save(client);
        return new ResponseEntity(new MessageDto("Registro exitoso"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<JwtDto> LoginClient(Client client) {
        Optional<Client> clientByEmail = clientRepository.findByEmail(client.getEmail());
        if(!clientByEmail.isPresent()){
            throw new ApiRequestException("Contraseña o correo erroneo");
        }
        if (passwordEncoder.matches(client.getPassword(),clientByEmail.get().getPassword())){
            Authentication authentication =
                    authenticationManager.authenticate
                            (new UsernamePasswordAuthenticationToken(client.getEmail(), client.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            JwtDto jwtDto = new JwtDto(
                    jwtProvider.generateToken(authentication), userDetails.getUsername(), userDetails.getAuthorities());
            return  new ResponseEntity<>(jwtDto, HttpStatus.OK);
        }
        throw new ApiRequestException("Contraseña o correo erroneo");
    }
}
