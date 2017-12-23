package dc.insurance.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Polisa implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private Date od;

    @Column(nullable = false)
    private Date doo;

    @Column(nullable = false)
    private int brOsoba;

    @Column(nullable = false, length = 50)
    private String email;

    @ManyToOne
    @JoinColumn
    private Osiguranik osiguranik;

    @ManyToOne
    @JoinColumn
    private Osiguravac osiguravac;

    public Polisa(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOd() {
        return od;
    }

    public void setOd(Date od) {
        this.od = od;
    }

    public Date getDoo() {
        return doo;
    }

    public void setDoo(Date doo) {
        this.doo = doo;
    }

    public int getBrOsoba() {
        return brOsoba;
    }

    public void setBrOsoba(int brOsoba) {
        this.brOsoba = brOsoba;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Osiguranik getOsiguranik() {
        return osiguranik;
    }

    public void setOsiguranik(Osiguranik osiguranik) {
        this.osiguranik = osiguranik;
    }

    public Osiguravac getOsiguravac() {
        return osiguravac;
    }

    public void setOsiguravac(Osiguravac osiguravac) {
        this.osiguravac = osiguravac;
    }
}
