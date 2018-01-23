package dc.insurance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TipRizika implements Serializable {

	@Id
	@GeneratedValue
	private int idTipRizika;

	@Column(nullable = false, length = 100)
	private String naziv;

	@ManyToOne
	@JoinColumn
	private Kategorija kategorija;

	public TipRizika() {
	}

	public int getIdTipRizika() {
		return idTipRizika;
	}

	public void setIdTipRizika(int idTipRizika) {
		this.idTipRizika = idTipRizika;
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
