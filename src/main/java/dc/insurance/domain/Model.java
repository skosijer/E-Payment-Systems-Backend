package dc.insurance.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Model implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 50)
    private String ime;

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

    public String getIme() {
        return ime;
    }

    public void setIme(String name) {
        this.ime = name;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }
}
