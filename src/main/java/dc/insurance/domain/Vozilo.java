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
import javax.persistence.ManyToOne;

@Entity
public class Vozilo implements Serializable {

	@GeneratedValue
	@Id
	private int idVozilo;

	@Column(nullable = false)
	private String godinaProizvodnje;

	@Column(nullable = false, length = 10)
	private String tablice;

	@Column(nullable = false, length = 30)
	private String brojSasije;

	@Column(nullable = false)
	private String markaTip;

	@ManyToOne
	@JoinColumn
	private Osoba vlasnik;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "vozilo_rizik", joinColumns = @JoinColumn(name = "idVozilo"), inverseJoinColumns = @JoinColumn(name = "idRizik"))
	private Collection<Rizik> rizici;

	public Vozilo() {
	}

	public int getIdVozilo() {
		return idVozilo;
	}

	public void setIdVozilo(int idVozilo) {
		this.idVozilo = idVozilo;
	}

	public String getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(String godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public String getTablice() {
		return tablice;
	}

	public void setTablice(String tablice) {
		this.tablice = tablice;
	}

	public String getBrojSasije() {
		return brojSasije;
	}

	public void setBrojSasije(String brojSasije) {
		this.brojSasije = brojSasije;
	}

	public String getMarkaTip() {
		return markaTip;
	}

	public void setMarkaTip(String markaTip) {
		this.markaTip = markaTip;
	}

	public Osoba getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}

	public Collection<Rizik> getRizici() {
		return rizici;
	}

	public void setRizici(Collection<Rizik> rizici) {
		this.rizici = rizici;
	}

}
