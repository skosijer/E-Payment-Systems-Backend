package dc.insurance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rizik implements Serializable {

	@Id
	@GeneratedValue
	private int idRizik;

	@Column(nullable = false, length = 255, unique = true)
	private String vrednost;

	@Column(nullable = true)
	private int kolicina;

	@ManyToOne
	@JoinColumn
	private TipRizika tipRizika;

	public Rizik() {
	}

	public int getIdRizik() {
		return idRizik;
	}

	public void setIdRizik(int idRizik) {
		this.idRizik = idRizik;
	}

	public String getVrednost() {
		return vrednost;
	}

	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public TipRizika getTipRizika() {
		return tipRizika;
	}

	public void setTipRizika(TipRizika tipRizika) {
		this.tipRizika = tipRizika;
	}

}
