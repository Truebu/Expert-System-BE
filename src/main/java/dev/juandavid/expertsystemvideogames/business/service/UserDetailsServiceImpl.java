package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.entities.Client;
import dev.juandavid.expertsystemvideogames.model.entities.CustomUserDetails;
import dev.juandavid.expertsystemvideogames.model.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final ClientRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Client user = userRepository.findByEmail(email).get();
        return CustomUserDetails.build(user);
    }
}

