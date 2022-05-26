package dev.juandavid.expertsystemvideogames.model.loder;

import dev.juandavid.expertsystemvideogames.business.service.SubCategoryService;
import dev.juandavid.expertsystemvideogames.model.entities.SubCategory;
import dev.juandavid.expertsystemvideogames.model.enums.SubCategoryName;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SubCategoryLoader implements CommandLineRunner {

    private final SubCategoryService service;

    @Override
    public void run(String... args) throws Exception {

        SubCategory subCategoryThirdPerson = new SubCategory(SubCategoryName.THIRD_PERSON);
        SubCategory subCategoryFirstPerson = new SubCategory(SubCategoryName.FIRST_PERSON);
        SubCategory subCategoryFantasy = new SubCategory(SubCategoryName.FANTASY);
        SubCategory subCategoryHorror = new SubCategory(SubCategoryName.HORROR);
        SubCategory subCategoryAction = new SubCategory(SubCategoryName.ACTION);
        SubCategory subCategoryScify = new SubCategory(SubCategoryName.SCIFY);

        service.save(subCategoryThirdPerson);
        service.save(subCategoryFirstPerson);
        service.save(subCategoryFantasy);
        service.save(subCategoryHorror);
        service.save(subCategoryAction);
        service.save(subCategoryScify);

    }
}
