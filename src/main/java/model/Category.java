package model;


import javax.persistence.*;

@Entity
@Table(name = "category_table")
public class Category {


//    CRONOS_OLD(Line.CRONOS, "Cronos Old"),
//    CRONOS_L(  Line.CRONOS, "Cronos L"),
//    CRONOS_NG( Line.CRONOS, "Cronos NG"),
//    ARES_TB(   Line.ARES,   "Ares TB"),
//    ARES_THS(  Line.ARES,   "Ares THS");

    @Id
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line line;

    public void setLine(Line line) {
        this.line = line;
    }

    public Category() {
    }

    public Category(Line line, String name){
        this.line = line;
        this.name = name;
    }

    public Line getLine() {
        return line;
    }

    @Override
    public String toString() {
        return name;
    }
}
