package dev.juandavid.expertsystemvideogames.model.entities;

import com.sun.istack.NotNull;
import dev.juandavid.expertsystemvideogames.model.enums.SubCategoryName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "subcategory")
@Table(name = "subcategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SubCategoryName subCategoryName;

    public SubCategory(@NotNull SubCategoryName subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
}
