package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.entities.Plataform;
import dev.juandavid.expertsystemvideogames.model.enums.PlataformName;
import dev.juandavid.expertsystemvideogames.model.repositories.PlataformRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
@AllArgsConstructor
public class PlataformService{

    private final PlataformRepository repository;

    public void save(Plataform plataform){
        repository.save(plataform);
    }

    public Optional<Plataform> getByPlataformName(PlataformName plataformName) {
        return repository.findByPlataformName(plataformName);
    }

    public Set<Plataform> buildSetPlataform(PlataformName[] plataformNames){
        Set<Plataform> plataforms = new HashSet<>();
        for (PlataformName plataformName:plataformNames
        ) {
            plataforms.add(this.getByPlataformName(plataformName).get());
        }
        return plataforms;
    }

    public List<Plataform> getPlataforms() {
        return repository.findAll();
    }
}
