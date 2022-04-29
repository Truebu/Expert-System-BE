package dev.juandavid.expertsystemvideogames.model.entities;

import com.sun.istack.NotNull;
import dev.juandavid.expertsystemvideogames.model.enums.MultiplayerName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity(name = "videogame")
@Table(name = "videogame")
@AllArgsConstructor
@NoArgsConstructor
public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name",nullable = false,columnDefinition = "TEXT")
    private String name;

    @Column(name = "style",nullable = false,columnDefinition = "TEXT")
    private String style;

    @NotNull
    @Enumerated(EnumType.STRING)
    private MultiplayerName multiplayerName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "category_videogame", joinColumns = @JoinColumn(name = "id_videogame"),
            inverseJoinColumns = @JoinColumn(name = "id_category"))
    private Set<Category> categories = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "gamer_videogame", joinColumns = @JoinColumn(name = "id_videogame"),
            inverseJoinColumns = @JoinColumn(name = "id_gamer"))
    private Set<Gamer> gamers = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "plataform_videogame", joinColumns = @JoinColumn(name = "id_videogame"),
            inverseJoinColumns = @JoinColumn(name = "id_plataform"))
    private Set<Plataform> plataforms = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "subcategory_videogame", joinColumns = @JoinColumn(name = "id_videogame"),
            inverseJoinColumns = @JoinColumn(name = "id_subcategory"))
    private Set<SubCategory> subCategories = new HashSet<>();
}
