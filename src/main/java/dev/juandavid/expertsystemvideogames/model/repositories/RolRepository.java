package dev.juandavid.expertsystemvideogames.model.repositories;

import dev.juandavid.expertsystemvideogames.model.entities.Rol;
import dev.juandavid.expertsystemvideogames.model.enums.RolName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface RolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByRolName(RolName rolName);
}
