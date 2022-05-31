package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.dto.FindVideoGameDto;
import dev.juandavid.expertsystemvideogames.model.entities.VideoGame;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VideoGameSevice {

    ResponseEntity<List<VideoGame>> findVideoGame(String request, FindVideoGameDto videoGameDto);
    ResponseEntity<VideoGame> findOneVideoGame();

    void save(VideoGame videoGame);
}