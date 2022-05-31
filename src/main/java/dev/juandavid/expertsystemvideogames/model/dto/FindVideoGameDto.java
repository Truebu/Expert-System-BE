package dev.juandavid.expertsystemvideogames.model.dto;

import dev.juandavid.expertsystemvideogames.model.enums.MultiplayerName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindVideoGameDto {

    private Long categoryId;
    private Long plataformId;
    private Long gamerId;
    private Long subCategoryId;
    private String style;
    private MultiplayerName multiplayerName;
}
