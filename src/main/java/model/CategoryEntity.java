package model;

import javax.persistence.*;

@Entity
@Table(name = "category_table")
public class CategoryEntity implements EntityInterface {
    @Id
    @Column(name = "name",columnDefinition = "text")
    private String name;

    @ManyToOne
    @JoinColumn(name = "line_id", columnDefinition = "text")
    private LineEntity line;

    public CategoryEntity() {}

    public CategoryEntity(LineEntity line, String name){
        this.line = line;
        this.name = name;
    }

    public LineEntity getLine() {
        return line;
    }

    public void setLine(LineEntity line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return name;
    }
}
