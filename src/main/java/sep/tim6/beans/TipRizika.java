package sep.tim6.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TipRizika implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 100)
    private String naziv;

    @ManyToOne
    @JoinColumn
    private Kategorija kategorija;

    public TipRizika(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }
}
