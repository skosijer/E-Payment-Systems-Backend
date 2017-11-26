package sep.tim6.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Nekretnina implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn
    private Osoba osoba;

    @ManyToOne
    @JoinColumn
    private Polisa polisa;

    public Nekretnina(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public Polisa getPolisa() {
        return polisa;
    }

    public void setPolisa(Polisa polisa) {
        this.polisa = polisa;
    }
}
