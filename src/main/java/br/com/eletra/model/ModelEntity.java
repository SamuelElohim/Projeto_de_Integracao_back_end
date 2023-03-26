package br.com.eletra.model;

import org.hibernate.annotations.Type;
import org.hibernate.type.descriptor.sql.SmallIntTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name = "model_table")
public class ModelEntity{
    @Id
    @Column(name="id", columnDefinition = "SMALLINT")
    @Type(type = "org.hibernate.type.ShortType")
    private Short id;

    @Column(name = "name",columnDefinition = "text")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", columnDefinition = "text")
    private CategoryEntity category;

    public ModelEntity() {}

    public ModelEntity(CategoryEntity category, String name, Short id) {
        this.id = id;
        this.category = category;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}
