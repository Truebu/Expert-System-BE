package dev.juandavid.expertsystemvideogames.business.controller;

import dev.juandavid.expertsystemvideogames.business.service.ClientService;
import dev.juandavid.expertsystemvideogames.model.dto.JwtDto;
import dev.juandavid.expertsystemvideogames.model.dto.MessageAuthDto;
import dev.juandavid.expertsystemvideogames.model.entities.Client;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/client")
public class ClientController {

    private final ClientService service;

    @PostMapping("/signup")
    public ResponseEntity<JwtDto> signUp(@RequestBody Client client){
        return service.saveNewClient(client);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> logIn(@RequestBody Client client){
        return service.LoginClient(client);
    }
}
