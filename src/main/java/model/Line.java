package model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@Entity
@Table(name = "line_table")
public class Line {
//    CRONOS("Cronos"),
//    ARES(  "Ares");

    @Id

    @Column(name = "name", columnDefinition = "text")
    private String name;

    public Line() {
    }

    public Line(String name) {
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
