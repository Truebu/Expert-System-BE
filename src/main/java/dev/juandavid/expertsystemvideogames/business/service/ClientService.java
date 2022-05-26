package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.dto.JwtDto;
import dev.juandavid.expertsystemvideogames.model.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface ClientService extends UserDetailsService {

    ResponseEntity<Client> showClient(String request);
    ResponseEntity<JwtDto> saveNewClient(Client client);
    ResponseEntity<JwtDto> LoginClient(Client client);
}
