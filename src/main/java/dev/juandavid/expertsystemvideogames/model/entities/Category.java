package dev.juandavid.expertsystemvideogames.model.entities;

import com.sun.istack.NotNull;
import dev.juandavid.expertsystemvideogames.model.enums.CategoryName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "category")
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private CategoryName categoryName;

    public Category(@NotNull CategoryName categoryName) {
        this.categoryName = categoryName;
    }
}
