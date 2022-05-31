package dev.juandavid.expertsystemvideogames.business.controller;

import dev.juandavid.expertsystemvideogames.business.service.VideoGameSevice;
import dev.juandavid.expertsystemvideogames.model.dto.FindVideoGameDto;
import dev.juandavid.expertsystemvideogames.model.entities.VideoGame;
import dev.juandavid.expertsystemvideogames.model.enums.MultiplayerName;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/videogame")
public class VideoGameController {

    private final VideoGameSevice videoGameSevice;

    @PostMapping
    public ResponseEntity<List<VideoGame>> findVideoGame(@RequestHeader(value = "Authorization") String request,
                                                         @RequestBody FindVideoGameDto videoGameDto){
        return videoGameSevice.findVideoGame(request, videoGameDto);
    }

    @PostMapping("/get")
    public ResponseEntity<VideoGame> getVideoGame(){
        return videoGameSevice.findOneVideoGame();
    }
}