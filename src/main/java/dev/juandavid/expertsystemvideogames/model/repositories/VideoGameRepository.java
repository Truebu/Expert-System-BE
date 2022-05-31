package dev.juandavid.expertsystemvideogames.model.repositories;

import dev.juandavid.expertsystemvideogames.model.entities.*;
import dev.juandavid.expertsystemvideogames.model.enums.MultiplayerName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Repository
@Transactional
public interface VideoGameRepository extends JpaRepository<VideoGame, Long>{

    @Query(value = "SELECT v FROM videogame as v WHERE v.categories = ?1 and v.subCategories = ?2 or v.plataforms = ?3 or v.gamers = ?4 and v.style =?5 and v.multiplayerName = ?6")
    List<VideoGame> findVideoGamesCustom(
            Set<Category> categories, Set<SubCategory> subCategories, Set<Plataform> plataforms,
            Set<Gamer> gamers, String style, MultiplayerName multiplayerName);
}
