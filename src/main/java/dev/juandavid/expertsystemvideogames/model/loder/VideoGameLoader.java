package dev.juandavid.expertsystemvideogames.model.loder;

import dev.juandavid.expertsystemvideogames.business.service.*;
import dev.juandavid.expertsystemvideogames.model.entities.*;
import dev.juandavid.expertsystemvideogames.model.enums.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class VideoGameLoader implements CommandLineRunner {

    private VideoGameSevice videoGameSevice;
    private CategoryService categoryService;
    private GamerService gamerService;
    private PlataformService plataformService;
    private SubCategoryService subCategoryService;


    @Override
    public void run(String... args) throws Exception {

        VideoGame game_have_a_nice_death = new VideoGame("Have a nice death", "2D", MultiplayerName.NOT);

        game_have_a_nice_death.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.ADVENTURE, CategoryName.COMBAT}));

        game_have_a_nice_death.setGamers(gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.HARDCORE}));

        game_have_a_nice_death.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC}));

        game_have_a_nice_death.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.THIRD_PERSON,SubCategoryName.FANTASY}));

        videoGameSevice.save(game_have_a_nice_death);

        VideoGame game_little_nighmares = new VideoGame("Little Nighmares", "2D", MultiplayerName.NOT);

        game_little_nighmares.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.SURVIVAL_HORROR, CategoryName.ADVENTURE}));

        game_little_nighmares.setGamers(gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.HARDCORE}));

        game_little_nighmares.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC, PlataformName.CONSOLE}));

        game_little_nighmares.setSubCategories(
                subCategoryService.buildSetSubCategory(new SubCategoryName[]{SubCategoryName.FANTASY, SubCategoryName.HORROR}));

        videoGameSevice.save(game_little_nighmares);

        VideoGame game_hollow_knight = new VideoGame("Hollow Knight", "2D", MultiplayerName.NOT);

        game_hollow_knight.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.COMBAT, CategoryName.ADVENTURE}));

        game_hollow_knight.setGamers(gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.HARDCORE}));

        game_hollow_knight.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC, PlataformName.CONSOLE}));

        game_hollow_knight.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.FANTASY, SubCategoryName.THIRD_PERSON, SubCategoryName.ACTION}));

        videoGameSevice.save(game_hollow_knight);

        VideoGame game_league_of_lengends = new VideoGame("League of Lengends", "2D", MultiplayerName.YES);

        game_league_of_lengends.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.MOBA, CategoryName.STRATEGY}));

        game_league_of_lengends.setGamers(
                gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.CASUAL, TypeGamerName.COMPETITIVE}));

        game_league_of_lengends.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC}));

        game_league_of_lengends.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.ACTION}));

        videoGameSevice.save(game_league_of_lengends);

        VideoGame game_among_us = new VideoGame("Among Us", "2D", MultiplayerName.YES);

        game_league_of_lengends.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.SURVIVAL_HORROR, CategoryName.STRATEGY}));

        game_league_of_lengends.setGamers(
                gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.CASUAL}));

        game_league_of_lengends.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC, PlataformName.CONSOLE}));

        game_league_of_lengends.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.SCIFY, SubCategoryName.HORROR}));

        videoGameSevice.save(game_league_of_lengends);

        VideoGame game_rise_of_nations = new VideoGame("Rise Of Nations", "2D", MultiplayerName.BOTH);

        game_rise_of_nations.setCategories(
                categoryService.buildSetCategory(
                        new CategoryName[]{CategoryName.STRATEGY, CategoryName.MOBA, CategoryName.HISTORICAL}));

        game_rise_of_nations.setGamers(
                gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.HARDCORE, TypeGamerName.COMPETITIVE}));

        game_rise_of_nations.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC}));

        game_rise_of_nations.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.ACTION}));

        videoGameSevice.save(game_rise_of_nations);

        VideoGame game_diablo = new VideoGame("Diablo", "2D", MultiplayerName.BOTH);

        game_diablo.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.SURVIVAL_HORROR, CategoryName.ADVENTURE}));

        game_diablo.setGamers(
                gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.COMPETITIVE, TypeGamerName.HARDCORE}));

        game_diablo.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC, PlataformName.CONSOLE}));

        game_diablo.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.ACTION, SubCategoryName.HORROR, SubCategoryName.FANTASY}));

        videoGameSevice.save(game_diablo);

        VideoGame game_ghost_of_a_tale = new VideoGame("Ghost of a Tale", "3D", MultiplayerName.NOT);

        game_ghost_of_a_tale.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.OPEN_WORLD, CategoryName.ADVENTURE}));

        game_ghost_of_a_tale.setGamers(
                gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.CASUAL}));

        game_ghost_of_a_tale.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC}));

        game_ghost_of_a_tale.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.FANTASY, SubCategoryName.THIRD_PERSON}));

        videoGameSevice.save(game_ghost_of_a_tale);

        VideoGame game_resident_evil = new VideoGame("Resident Evil", "3D", MultiplayerName.NOT);

        game_resident_evil.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.SURVIVAL_HORROR, CategoryName.SHOOTER}));

        game_resident_evil.setGamers(
                gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.COMPETITIVE, TypeGamerName.HARDCORE}));

        game_resident_evil.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC}));

        game_resident_evil.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.THIRD_PERSON, SubCategoryName.HORROR}));

        videoGameSevice.save(game_resident_evil);

        VideoGame game_detroit_become_human = new VideoGame("Detroit Become Human", "3D", MultiplayerName.NOT);

        game_detroit_become_human.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.STRATEGY}));

        game_detroit_become_human.setGamers(
                gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.COMPETITIVE, TypeGamerName.CASUAL}));

        game_detroit_become_human.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC, PlataformName.CONSOLE}));

        game_detroit_become_human.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.ACTION, SubCategoryName.SCIFY, SubCategoryName.THIRD_PERSON}));

        videoGameSevice.save(game_detroit_become_human);

        VideoGame game_the_last_of_us = new VideoGame("The Last Of Us", "3D", MultiplayerName.NOT);

        game_the_last_of_us.setCategories(
                categoryService.buildSetCategory(new CategoryName[]{CategoryName.SURVIVAL_HORROR, CategoryName.SHOOTER}));

        game_the_last_of_us.setGamers(
                gamerService.buildSetGamer(new TypeGamerName[]{TypeGamerName.COMPETITIVE, TypeGamerName.HARDCORE}));

        game_the_last_of_us.setPlataforms(
                plataformService.buildSetPlataform(new PlataformName[]{PlataformName.PC}));

        game_the_last_of_us.setSubCategories(
                subCategoryService.buildSetSubCategory(
                        new SubCategoryName[]{SubCategoryName.THIRD_PERSON, SubCategoryName.HORROR}));

        videoGameSevice.save(game_the_last_of_us);
    }
}
