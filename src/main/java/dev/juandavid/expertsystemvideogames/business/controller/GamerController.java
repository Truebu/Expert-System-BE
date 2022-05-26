package dev.juandavid.expertsystemvideogames.business.controller;

import dev.juandavid.expertsystemvideogames.business.service.GamerService;
import dev.juandavid.expertsystemvideogames.model.entities.Gamer;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/videogame/gamer")
public class GamerController {

    private final GamerService service;

    @GetMapping
    public ResponseEntity<List<Gamer>> getTypeGamers(){
        return new ResponseEntity<>(service.getTypeGamers(), HttpStatus.OK);
    }
}
