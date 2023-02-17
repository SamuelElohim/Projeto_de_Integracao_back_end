package model;


import javax.persistence.*;

@Entity
@Table(name = "line_table")
public class LineEntity implements EntityInterface {

    @Id
    @Column(name = "name", columnDefinition = "text")
    private String name;

    public LineEntity() {}

    public LineEntity(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
