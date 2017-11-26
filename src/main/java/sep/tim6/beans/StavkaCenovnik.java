package sep.tim6.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class StavkaCenovnik implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private double iznos;

    @ManyToOne
    @JoinColumn
    private Cenovnik cenovnik;

    public StavkaCenovnik(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Cenovnik getCenovnik() {
        return cenovnik;
    }

    public void setCenovnik(Cenovnik cenovnik) {
        this.cenovnik = cenovnik;
    }
}
