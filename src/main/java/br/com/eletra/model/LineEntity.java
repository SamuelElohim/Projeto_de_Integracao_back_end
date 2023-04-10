package br.com.eletra.model;


import org.hibernate.annotations.Type;
import org.hibernate.type.descriptor.sql.SmallIntTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name = "line_table")
public class LineEntity{

    @Id
    @Column(name="id", columnDefinition = "SMALLINT")
    @Type(type = "org.hibernate.type.ShortType")
    private Short id;

    @Column(name = "name", columnDefinition = "text")
    private String name;

    public LineEntity() {}

    public LineEntity(String name, Short id) {
        this.id = id;
        this.name = name;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
