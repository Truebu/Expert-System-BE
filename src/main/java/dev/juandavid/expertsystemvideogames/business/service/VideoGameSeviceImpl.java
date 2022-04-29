package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.entities.VideoGame;
import dev.juandavid.expertsystemvideogames.model.repositories.VideoGameRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VideoGameSeviceImpl implements VideoGameSevice{

    private final VideoGameRepository videoGameRepository;

    @Override
    public ResponseEntity<VideoGame> findVideoGame(VideoGame videoGame) {
        return null;
    }
}