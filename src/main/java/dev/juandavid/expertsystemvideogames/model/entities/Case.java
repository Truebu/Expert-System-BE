package dev.juandavid.expertsystemvideogames.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "case")
@Table(name = "case")
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    //@OneToMany(mappedBy = "case")
    //private Set<Answer> answers = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "suggest", joinColumns = @JoinColumn(name = "id_case"),
            inverseJoinColumns = @JoinColumn(name = "id_videogame"))
    private List<VideoGame> videoGames = new ArrayList<>();

    public Case(Client client, List<VideoGame> videoGames) {
        this.client = client;
        this.videoGames = videoGames;
    }
}
