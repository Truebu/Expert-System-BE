package dev.juandavid.expertsystemvideogames.business.controller;

import dev.juandavid.expertsystemvideogames.business.service.SubCategoryService;
import dev.juandavid.expertsystemvideogames.model.entities.SubCategory;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/videogame/subCategory")
public class SubCategoryController {

    private final SubCategoryService service;

    @GetMapping
    public ResponseEntity<List<SubCategory>> getSubCategories(){
        return new ResponseEntity<>(service.getSubCategories(), HttpStatus.OK);
    }
}
