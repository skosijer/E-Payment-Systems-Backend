package dc.insurance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Stavka implements Serializable {

	@Id
	@GeneratedValue
	private int idStavka;

	@Column(nullable = true)
	private Double kolicnik;

	@Column(nullable = true)
	private Double jedinicnaCena;

	@ManyToOne
	@JoinColumn
	private Rizik rizik;

	public Stavka() {
	}

	public int getIdStavka() {
		return idStavka;
	}

	public void setIdStavka(int idStavka) {
		this.idStavka = idStavka;
	}

	public Double getKolicnik() {
		return kolicnik;
	}

	public void setKolicnik(Double kolicnik) {
		this.kolicnik = kolicnik;
	}

	public Double getJedinicnaCena() {
		return jedinicnaCena;
	}

	public void setJedinicnaCena(Double jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public Rizik getRizik() {
		return rizik;
	}

	public void setRizik(Rizik rizik) {
		this.rizik = rizik;
	}

}
