package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.dto.JwtDto;
import dev.juandavid.expertsystemvideogames.model.dto.MessageAuthDto;
import dev.juandavid.expertsystemvideogames.model.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface ClientService extends UserDetailsService {

    ResponseEntity<Client> showClient(String request);
    ResponseEntity<MessageAuthDto> saveNewClient(Client client);
    ResponseEntity<MessageAuthDto> LoginClient(Client client);

}
