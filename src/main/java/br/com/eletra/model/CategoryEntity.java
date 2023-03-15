package br.com.eletra.model;

import org.hibernate.annotations.Type;
import org.hibernate.type.descriptor.sql.SmallIntTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name = "category_table")
public class CategoryEntity implements EntityInterface {
    @Id
    @Column(name="id", columnDefinition = "SMALLINT")
    @Type(type = "org.hibernate.type.ShortType")
    private Short id;

    @Column(name = "name",columnDefinition = "text")
    private String name;

    @ManyToOne
    @JoinColumn(name = "line_id", columnDefinition = "text")
    private LineEntity line;

    public CategoryEntity() {}

    public CategoryEntity(LineEntity line, String name, Short id){
        this.id = id;
        this.line = line;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LineEntity getLine() {
        return line;
    }

    public void setLine(LineEntity line) {
        this.line = line;
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
