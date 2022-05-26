package dev.juandavid.expertsystemvideogames.business.controller;

import dev.juandavid.expertsystemvideogames.business.service.PlataformService;
import dev.juandavid.expertsystemvideogames.model.entities.Plataform;
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
@RequestMapping("/api/v1/videogame/plataform")
public class PlataformContrller {

    private final PlataformService service;

    @GetMapping
    public ResponseEntity<List<Plataform>> getPlataforms(){
        return new ResponseEntity<>(service.getPlataforms(), HttpStatus.OK);
    }
}
