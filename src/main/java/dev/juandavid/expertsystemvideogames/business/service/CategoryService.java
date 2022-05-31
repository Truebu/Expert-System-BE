package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.entities.Category;
import dev.juandavid.expertsystemvideogames.model.enums.CategoryName;
import dev.juandavid.expertsystemvideogames.model.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public void save(Category category){
        repository.save(category);
    }

    public Optional<Category> getByCategoryName(CategoryName categoryName){
        return repository.findByCategoryName(categoryName);
    }

    public List<Category> getCategories(){
        return repository.findAll();
    }

    public Set<Category> buildSetCategory(CategoryName[] categoryNames){
        Set<Category> categories = new HashSet<>();
        for (CategoryName categoryName:categoryNames
             ) {
            categories.add(this.getByCategoryName(categoryName).get());
        }
        return categories;
    }

}
