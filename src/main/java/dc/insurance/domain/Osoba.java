package dc.insurance.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Osoba implements Serializable {

	@Id
	@GeneratedValue
	private int idOsoba;

	@Enumerated(EnumType.STRING)
	private TIPOSOBE tipOsobe;

	@Column(length = 30)
	private String ime;

	@Column(length = 30)
	private String prezime;

	@Column(length = 13)
	private String JMBG;

	@Column(length = 100)
	private String adresa;

	@Column(length = 50)
	private String brojPasosa;

	@Column(length = 50)
	private String brojTelefona;

	@Column
	private Date datumRodjenja;

	@Column(length = 50)
	private String email;

	public enum TIPOSOBE {
		PRODAVAC, OSIGURANIK, FINANSIJSKI_ANALITICAR, DRUGO_LICE
	};

	public Osoba() {
	}

	public Osoba(TIPOSOBE tipOsobe, String ime, String prezime, String JMBG, String adresa, String brojPasosa, String brojTelefona, Date datumRodjenja, String email) {
		this.tipOsobe = tipOsobe;
		this.ime = ime;
		this.prezime = prezime;
		this.JMBG = JMBG;
		this.adresa = adresa;
		this.brojPasosa = brojPasosa;
		this.brojTelefona = brojTelefona;
		this.datumRodjenja = datumRodjenja;
		this.email = email;
	}

	public int getIdOsoba() {
		return idOsoba;
	}

	public void setIdOsoba(int idOsoba) {
		this.idOsoba = idOsoba;
	}

	public TIPOSOBE getTipOsobe() {
		return tipOsobe;
	}

	public void setTipOsobe(TIPOSOBE tipOsobe) {
		this.tipOsobe = tipOsobe;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getBrojPasosa() {
		return brojPasosa;
	}

	public void setBrojPasosa(String brojPasosa) {
		this.brojPasosa = brojPasosa;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
