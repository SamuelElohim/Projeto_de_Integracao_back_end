package model;

import javax.persistence.*;

@Entity
@Table(name = "model_table")
public class ModelEntity {
    @Id
    @Column(name = "name",columnDefinition = "text")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", columnDefinition = "text")
    private CategoryEntity category;


    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public ModelEntity() {
    }

    public ModelEntity(CategoryEntity category, String name) {
        this.category = category;
        this.name = name;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name;
    }
}
