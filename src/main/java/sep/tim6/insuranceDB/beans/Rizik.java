package sep.tim6.insuranceDB.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Rizik implements Serializable {

    @GeneratedValue
    @Id
    private int id;

    @Column(nullable = false, length = 255)
    private String vrednost;

    @ManyToOne
    @JoinColumn
    private TipRizika tipRizika;

    @ManyToOne
    @JoinColumn
    private StavkaCenovnik stavkaCenovnik;

    public Rizik(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVrednost() {
        return vrednost;
    }

    public void setVrednost(String vrednost) {
        this.vrednost = vrednost;
    }

    public TipRizika getTipRizika() {
        return tipRizika;
    }

    public void setTipRizika(TipRizika tipRizika) {
        this.tipRizika = tipRizika;
    }

    public StavkaCenovnik getStavkaCenovnik() {
        return stavkaCenovnik;
    }

    public void setStavkaCenovnik(StavkaCenovnik stavkaCenovnik) {
        this.stavkaCenovnik = stavkaCenovnik;
    }
}
