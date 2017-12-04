package sep.tim6.insuranceDB.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Osoba implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 30, nullable = false)
    private String ime;

    @Column(length = 30, nullable = false)
    private String prezime;

    @Column(length = 13, nullable = false)
    private String JMBG;

    @Column(length = 100, nullable = false)
    private String adresa;

    public Osoba(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
