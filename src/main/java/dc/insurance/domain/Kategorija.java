package dc.insurance.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Kategorija implements Serializable {

	@Id
	@GeneratedValue
	private int idKategorija;

	@Column(nullable = false, length = 100)
	private String naziv;

	public Kategorija() {
	}

	public int getIdKategorija() {
		return idKategorija;
	}

	public void setIdKategorija(int idKategorija) {
		this.idKategorija = idKategorija;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
