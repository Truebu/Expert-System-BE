package dev.juandavid.expertsystemvideogames.model.entities;

import com.sun.istack.NotNull;
import dev.juandavid.expertsystemvideogames.model.enums.CategoryName;
import dev.juandavid.expertsystemvideogames.model.enums.TypeGamerName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "gamer")
@Table(name = "gamer")
public class Gamer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TypeGamerName typeGamerName;

    public Gamer(@NotNull TypeGamerName typeGamerName) {
        this.typeGamerName = typeGamerName;
    }
}
