package dev.juandavid.expertsystemvideogames.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
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

    @OneToMany(mappedBy = "case")
    private Set<Answer> answers = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "suggest", joinColumns = @JoinColumn(name = "id_case"),
            inverseJoinColumns = @JoinColumn(name = "id_videogame"))
    private Set<VideoGame> videoGames = new HashSet<>();
}
