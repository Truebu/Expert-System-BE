package dev.juandavid.expertsystemvideogames.model.repositories;

import dev.juandavid.expertsystemvideogames.model.entities.Gamer;
import dev.juandavid.expertsystemvideogames.model.enums.TypeGamerName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface GamerRepository extends JpaRepository<Gamer, Long> {

    Optional<Gamer> findByTypeGamerName (TypeGamerName typeGamerName);
}
