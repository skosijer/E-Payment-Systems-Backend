package dc.insurance.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Osiguranik implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 15, nullable = false)
    private String brojPasosa;

    @Column(length = 30, nullable = false)
    private String brojTelefona;

    @ManyToOne
    @JoinColumn
    private Osoba osoba;

    public Osiguranik(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrojPasosa() {
        return brojPasosa;
    }

    public void setBrojPasosa(String brojPasosa) {
        this.brojPasosa = brojPasosa;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
}
