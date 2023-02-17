package model;

import javax.persistence.*;

@Entity
@Table(name = "model_table")
public class ModelEntity implements EntityInterface {
    @Id
    @Column(name = "name",columnDefinition = "text")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", columnDefinition = "text")
    private CategoryEntity category;

    public ModelEntity() {}

    public ModelEntity(CategoryEntity category, String name) {
        this.category = category;
        this.name = name;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name;
    }
}
