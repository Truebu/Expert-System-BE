package dev.juandavid.expertsystemvideogames.model.loder;

import dev.juandavid.expertsystemvideogames.business.service.PlataformService;
import dev.juandavid.expertsystemvideogames.model.entities.Plataform;
import dev.juandavid.expertsystemvideogames.model.enums.PlataformName;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlataformLoader implements CommandLineRunner {

    private PlataformService service;

    @Override
    public void run(String... args) throws Exception {

        Plataform plataformPc = new Plataform(PlataformName.PC);
        Plataform plataformConsole = new Plataform(PlataformName.CONSOLE);

        service.save(plataformPc);
        service.save(plataformConsole);

    }
}
