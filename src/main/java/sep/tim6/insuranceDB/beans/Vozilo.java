package sep.tim6.insuranceDB.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Vozilo implements Serializable {

    @GeneratedValue
    @Id
    private int id;

    @Column(nullable = false)
    private Date godProizvodnje;

    @Column(nullable = false, length = 10)
    private String regTablice;

    @Column(nullable = false, length = 30)
    private String brSasije;

    @ManyToOne
    @JoinColumn
    private Osoba osoba;

    @ManyToOne
    @JoinColumn
    private Polisa polisa;

    @ManyToOne
    @JoinColumn
    private Marka marka;

    @ManyToOne
    @JoinColumn
    private Model model;

    @Column(nullable = false)
    private boolean jeVlasnik = true;

    public Vozilo(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getGodProizvodnje() {
        return godProizvodnje;
    }

    public void setGodProizvodnje(Date godProizvodnje) {
        this.godProizvodnje = godProizvodnje;
    }

    public String getRegTablice() {
        return regTablice;
    }

    public void setRegTablice(String regTablice) {
        this.regTablice = regTablice;
    }

    public String getBrSasije() {
        return brSasije;
    }

    public void setBrSasije(String brSasije) {
        this.brSasije = brSasije;
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

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public boolean isJeVlasnik() {
        return jeVlasnik;
    }

    public void setJeVlasnik(boolean jeVlasnik) {
        this.jeVlasnik = jeVlasnik;
    }
}
