package sep.tim6.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Stavka implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn
    private Faktura faktura;

    @ManyToOne
    @JoinColumn
    private Rizik rizik;

    public Stavka(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Faktura getFaktura() {
        return faktura;
    }

    public void setFaktura(Faktura faktura) {
        this.faktura = faktura;
    }

    public Rizik getRizik() {
        return rizik;
    }

    public void setRizik(Rizik rizik) {
        this.rizik = rizik;
    }
}
