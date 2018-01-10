package dc.insurance.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

    @ManyToMany
    @JoinColumn
    private List<Osiguranik> osiguranici;

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

    public List<Osiguranik> getOsiguranici() {
        return osiguranici;
    }

    public void setOsiguranici(List<Osiguranik> osiguranici) {
        this.osiguranici = osiguranici;
    }

    public Osiguravac getOsiguravac() {
        return osiguravac;
    }

    public void setOsiguravac(Osiguravac osiguravac) {
        this.osiguravac = osiguravac;
    }
}
