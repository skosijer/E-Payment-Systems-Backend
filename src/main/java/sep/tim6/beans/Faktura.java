package sep.tim6.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Faktura implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn
    private Osiguranik osiguranik;

    @ManyToOne
    @JoinColumn
    private Polisa polisa;

    public Faktura(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Osiguranik getOsiguranik() {
        return osiguranik;
    }

    public void setOsiguranik(Osiguranik osiguranik) {
        this.osiguranik = osiguranik;
    }

    public Polisa getPolisa() {
        return polisa;
    }

    public void setPolisa(Polisa polisa) {
        this.polisa = polisa;
    }
}
