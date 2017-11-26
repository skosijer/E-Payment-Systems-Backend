package sep.tim6.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Model implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 50)
    private String name;

    @ManyToOne
    @JoinColumn
    private Marka marka;

    public Model(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }
}
