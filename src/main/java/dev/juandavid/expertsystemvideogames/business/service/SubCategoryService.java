package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.entities.SubCategory;
import dev.juandavid.expertsystemvideogames.model.enums.SubCategoryName;
import dev.juandavid.expertsystemvideogames.model.repositories.SubCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class SubCategoryService {

    private final SubCategoryRepository repository;

    public void save (SubCategory category){
        repository.save(category);
    }

    public Optional<SubCategory> getBySubCategoryName(SubCategoryName subCategoryName) {
        return repository.findBySubCategoryName(subCategoryName);
    }

    public Set<SubCategory> buildSetSubCategory(SubCategoryName[] subCategoryNames){
        Set<SubCategory> subCategories = new HashSet<>();
        for (SubCategoryName subCategoryName:subCategoryNames
        ) {
            subCategories.add(this.getBySubCategoryName(subCategoryName).get());
        }
        return subCategories;
    }

    public List<SubCategory> getSubCategories() {
        return repository.findAll();
    }
}
