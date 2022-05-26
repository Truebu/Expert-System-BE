package dev.juandavid.expertsystemvideogames.model.repositories;

import dev.juandavid.expertsystemvideogames.model.entities.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface VideoGameRepository extends JpaRepository<VideoGame, Long> {
}
