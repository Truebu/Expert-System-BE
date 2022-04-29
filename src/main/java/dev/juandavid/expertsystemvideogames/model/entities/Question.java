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
@Entity(name = "question")
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "question",nullable = false,columnDefinition = "TEXT")
    private String question;

    @OneToMany(mappedBy = "question")
    private Set<Answer> answers = new HashSet<>();

    @OneToMany(mappedBy = "question")
    private Set<AnswerQuestion> answerQuestions= new HashSet<>();

}
