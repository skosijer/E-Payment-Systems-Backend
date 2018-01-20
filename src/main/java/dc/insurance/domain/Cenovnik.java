package dc.insurance.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cenovnik implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private Date od;

    @Column(nullable = false)
    private Date doo;

    public Cenovnik(){}

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
    
}
