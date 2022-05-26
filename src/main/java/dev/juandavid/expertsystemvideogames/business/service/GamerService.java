package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.entities.Category;
import dev.juandavid.expertsystemvideogames.model.entities.Gamer;
import dev.juandavid.expertsystemvideogames.model.enums.CategoryName;
import dev.juandavid.expertsystemvideogames.model.enums.TypeGamerName;
import dev.juandavid.expertsystemvideogames.model.repositories.GamerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
@AllArgsConstructor
public class GamerService {

    private final GamerRepository repository;

    public void save(Gamer gamer){
        repository.save(gamer);
    }

    public Optional<Gamer> getByTypeGamerName(TypeGamerName typeGamerName) {
        return repository.findByTypeGamerName(typeGamerName);
    }

    public Set<Gamer> buildSetGamer(TypeGamerName[] typeGamerNames){
        Set<Gamer> gamers = new HashSet<>();
        for (TypeGamerName typeGamerName:typeGamerNames
        ) {
            gamers.add(this.getByTypeGamerName(typeGamerName).get());
        }
        return gamers;
    }

    public List<Gamer> getTypeGamers() {
        return repository.findAll();
    }
}
