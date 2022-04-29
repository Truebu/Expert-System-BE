package dev.juandavid.expertsystemvideogames.business.controller;

import dev.juandavid.expertsystemvideogames.business.service.VideoGameSeviceImpl;
import dev.juandavid.expertsystemvideogames.model.entities.VideoGame;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/videogame")
public class VideoGameController {

    private final VideoGameSeviceImpl videoGameSevice;

    @GetMapping
    public ResponseEntity<VideoGame> findVideoGame(@RequestBody VideoGame videoGame){
        return videoGameSevice.findVideoGame(videoGame);
    }

}