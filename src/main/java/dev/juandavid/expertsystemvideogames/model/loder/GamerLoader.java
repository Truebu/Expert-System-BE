package dev.juandavid.expertsystemvideogames.model.loder;

import dev.juandavid.expertsystemvideogames.business.service.GamerService;
import dev.juandavid.expertsystemvideogames.model.entities.Gamer;
import dev.juandavid.expertsystemvideogames.model.enums.TypeGamerName;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GamerLoader implements CommandLineRunner {

    private GamerService service;

    @Override
    public void run(String... args) throws Exception {

        Gamer gamerHardcore = new Gamer(TypeGamerName.HARDCORE);
        Gamer gamerCasual = new Gamer(TypeGamerName.CASUAL);
        Gamer gamerCompetitive = new Gamer(TypeGamerName.COMPETITIVE);

        service.save(gamerHardcore);
        service.save(gamerCasual);
        service.save(gamerCompetitive);
    }
}
