package dev.juandavid.expertsystemvideogames.model.repositories;

import dev.juandavid.expertsystemvideogames.model.entities.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoGameRepository extends JpaRepository<VideoGame, Long> {
}
