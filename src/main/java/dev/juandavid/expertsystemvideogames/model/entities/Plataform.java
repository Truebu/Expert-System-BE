package dev.juandavid.expertsystemvideogames.model.entities;

import com.sun.istack.NotNull;
import dev.juandavid.expertsystemvideogames.model.enums.PlataformName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "plataform")
@Table(name = "plataform")
public class Plataform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PlataformName plataformName;

    public Plataform(@NotNull PlataformName plataformName) {
        this.plataformName = plataformName;
    }
}
