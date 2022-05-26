package dev.juandavid.expertsystemvideogames.model.loder;

import dev.juandavid.expertsystemvideogames.business.service.CategoryService;
import dev.juandavid.expertsystemvideogames.model.entities.Category;
import dev.juandavid.expertsystemvideogames.model.enums.CategoryName;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CategoryLoader implements CommandLineRunner {

    private CategoryService service;

    @Override
    public void run(String... args) throws Exception {

        Category categoryShooter = new Category(CategoryName.SHOOTER);
        Category categoryStrategy = new Category(CategoryName.STRATEGY);
        Category categoryMoba = new Category(CategoryName.MOBA);
        Category categoryAdventure = new Category(CategoryName.ADVENTURE);
        Category categorySurvivalHorror = new Category(CategoryName.SURVIVAL_HORROR);
        Category categoryOpenWorld = new Category(CategoryName.OPEN_WORLD);
        Category categoryCombat = new Category(CategoryName.COMBAT);
        Category categoryHistorical = new Category(CategoryName.HISTORICAL);

        service.save(categoryShooter);
        service.save(categoryStrategy);
        service.save(categoryMoba);
        service.save(categoryAdventure);
        service.save(categorySurvivalHorror);
        service.save(categoryOpenWorld);
        service.save(categoryCombat);
        service.save(categoryHistorical);

    }
}
