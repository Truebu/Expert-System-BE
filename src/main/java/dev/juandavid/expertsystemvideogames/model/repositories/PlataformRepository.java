package dev.juandavid.expertsystemvideogames.model.repositories;

import dev.juandavid.expertsystemvideogames.model.entities.Plataform;
import dev.juandavid.expertsystemvideogames.model.enums.PlataformName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface PlataformRepository extends JpaRepository<Plataform, Long> {

    Optional<Plataform> findByPlataformName(PlataformName plataformName);
}
