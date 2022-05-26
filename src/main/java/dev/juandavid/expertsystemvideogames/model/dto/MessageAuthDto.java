package dev.juandavid.expertsystemvideogames.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageAuthDto {

    private String message;
    private String token;

}
