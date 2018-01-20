package dc.insurance.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Nekretnina implements Serializable {

	@Id
	@GeneratedValue
	private int idNekretnina;

	@ManyToOne
	@JoinColumn
	private Osoba vlasnik;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "nekretnina_rizik", joinColumns = @JoinColumn(name = "idNekretnina"), inverseJoinColumns = @JoinColumn(name = "idRizik"))
	private Collection<Rizik> rizici;

	public Nekretnina() {
	}

	public int getIdNekretnina() {
		return idNekretnina;
	}

	public void setIdNekretnina(int idNekretnina) {
		this.idNekretnina = idNekretnina;
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
