package dc.insurance.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Polisa implements Serializable {

	@Id
	@GeneratedValue
	private int idPolisa;

	@Column(nullable = false)
	private Date datum;

	@Column(nullable = false)
	private int trajanje;

	@Column(nullable = false, length = 50)
	private String email;

	@OneToMany
	@JoinColumn
	private Collection<Osoba> osiguranici;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "polisa_rizik", joinColumns = @JoinColumn(name = "idPolisa"), inverseJoinColumns = @JoinColumn(name = "idRizik"))
	private Collection<Rizik> rizici;

	@OneToMany
	@JoinColumn
	private Collection<Vozilo> vozila;

	@OneToMany
	@JoinColumn
	private Collection<Nekretnina> nekretnine;

	@OneToOne
	@JoinColumn(nullable = true)
	private Osoba prodavac;

	@OneToOne
	@JoinColumn(nullable = false)
	private Osoba nosilac;

	public Polisa() {
	}

	public int getIdPolisa() {
		return idPolisa;
	}

	public void setIdPolisa(int idPolisa) {
		this.idPolisa = idPolisa;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public int getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Osoba> getOsiguranici() {
		return osiguranici;
	}

	public void setOsiguranici(Collection<Osoba> osiguranici) {
		this.osiguranici = osiguranici;
	}

	public Collection<Rizik> getRizici() {
		return rizici;
	}

	public void setRizici(Collection<Rizik> rizici) {
		this.rizici = rizici;
	}

	public Collection<Vozilo> getVozila() {
		return vozila;
	}

	public void setVozila(Collection<Vozilo> vozila) {
		this.vozila = vozila;
	}

	public Collection<Nekretnina> getNekretnine() {
		return nekretnine;
	}

	public void setNekretnine(Collection<Nekretnina> nekretnine) {
		this.nekretnine = nekretnine;
	}

	public Osoba getProdavac() {
		return prodavac;
	}

	public void setProdavac(Osoba prodavac) {
		this.prodavac = prodavac;
	}

	public Osoba getNosilac() {
		return nosilac;
	}

	public void setNosilac(Osoba nosilac) {
		this.nosilac = nosilac;
	}

}
