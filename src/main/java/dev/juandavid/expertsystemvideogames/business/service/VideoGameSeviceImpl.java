package dev.juandavid.expertsystemvideogames.business.service;

import dev.juandavid.expertsystemvideogames.model.dto.FindVideoGameDto;
import dev.juandavid.expertsystemvideogames.model.entities.Case;
import dev.juandavid.expertsystemvideogames.model.entities.Client;
import dev.juandavid.expertsystemvideogames.model.entities.VideoGame;
import dev.juandavid.expertsystemvideogames.model.repositories.*;
import dev.juandavid.expertsystemvideogames.security.jwt.JwtProvider;
import dev.juandavid.expertsystemvideogames.security.jwt.JwtTokenFilter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class VideoGameSeviceImpl implements VideoGameSevice{

    private final VideoGameRepository videoGameRepository;
    private final ClientRepository clientRepository;
    private final CategoryRepository categoryRepository;
    private final SubCategoryRepository subCategoryRepository;
    private final PlataformRepository plataformRepository;
    private final GamerRepository gamerRepository;
    private final CaseRepository caseRepository;
    private final JwtTokenFilter jwtTokenFilter;
    private final JwtProvider jwtProvider;

    @Override
    public ResponseEntity<List<VideoGame>> findVideoGame(String request, FindVideoGameDto videoGameDto) {
        Client currentClient = getCurrentClient(request);
        List<VideoGame> videoGames= videoGameRepository.findVideoGamesCustom(
                new HashSet(Arrays.asList( categoryRepository.findById(videoGameDto.getCategoryId()).get())),
                new HashSet(Arrays.asList( subCategoryRepository.findById(videoGameDto.getSubCategoryId()).get())),
                new HashSet(Arrays.asList( plataformRepository.findById(videoGameDto.getPlataformId()).get())),
                new HashSet(Arrays.asList( gamerRepository.findById(videoGameDto.getGamerId()).get())),
                videoGameDto.getStyle(),videoGameDto.getMultiplayerName());
        Case aCase = new Case(currentClient, new ArrayList<>(videoGames));
        caseRepository.save(aCase);
        return new ResponseEntity<>(videoGames, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<VideoGame> findOneVideoGame() {
        return new ResponseEntity<>(videoGameRepository.findById(Long.parseLong("10")).get(), HttpStatus.OK);
    }

    @Override
    public void save(VideoGame videoGame) {
        videoGameRepository.save(videoGame);
    }

    public Client getCurrentClient(String request){
        return clientRepository.findByEmail(
                jwtProvider.getEmailFromToken(jwtTokenFilter.getTokenByString(request))).get();
    }
}