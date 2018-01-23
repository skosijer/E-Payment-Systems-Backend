package dc.insurance.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cenovnik implements Serializable {

	@Id
	@GeneratedValue
	private int idCenovnik;

	@Column(nullable = false)
	private Date datumOd;

	@Column(nullable = false)
	private Date datumDo;

	@OneToMany
	@JoinColumn
	private Collection<Stavka> stavke;

	public Cenovnik() {
	}

	public int getIdCenovnik() {
		return idCenovnik;
	}

	public void setIdCenovnik(int idCenovnik) {
		this.idCenovnik = idCenovnik;
	}

	public Date getDatumOd() {
		return datumOd;
	}

	public void setDatumOd(Date datumOd) {
		this.datumOd = datumOd;
	}

	public Date getDatumDo() {
		return datumDo;
	}

	public void setDatumDo(Date datumDo) {
		this.datumDo = datumDo;
	}

	public Collection<Stavka> getStavke() {
		return stavke;
	}

	public void setStavke(Collection<Stavka> stavke) {
		this.stavke = stavke;
	}

}
