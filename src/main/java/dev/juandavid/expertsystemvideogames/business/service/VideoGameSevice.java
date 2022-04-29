package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.entities.VideoGame;
import org.springframework.http.ResponseEntity;

public interface VideoGameSevice {

    ResponseEntity<VideoGame> findVideoGame(VideoGame videoGame);
}