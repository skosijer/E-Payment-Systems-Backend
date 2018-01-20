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

	@Column(nullable = false)
	private int kolicnik;

	@Column(nullable = false)
	private int jedinicnaCena;

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

	public int getKolicnik() {
		return kolicnik;
	}

	public void setKolicnik(int kolicnik) {
		this.kolicnik = kolicnik;
	}

	public int getJedinicnaCena() {
		return jedinicnaCena;
	}

	public void setJedinicnaCena(int jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public Rizik getRizik() {
		return rizik;
	}

	public void setRizik(Rizik rizik) {
		this.rizik = rizik;
	}

}
