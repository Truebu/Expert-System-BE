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
@Entity(name = "client")
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "email",nullable = false,columnDefinition = "TEXT", unique = true)
    private String email;

    @Column(name = "name",nullable = false,columnDefinition = "TEXT")
    private String name;

    @Column(name = "password",nullable = false,columnDefinition = "TEXT")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "client_rol", joinColumns = @JoinColumn(name = "id_client"),
            inverseJoinColumns = @JoinColumn(name = "id_rol"))
    private Set<Rol> rols = new HashSet<>();

    @OneToMany(mappedBy = "client")
    private Set<Case> cases = new HashSet<>();
}
