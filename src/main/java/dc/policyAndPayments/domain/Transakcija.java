package dc.policyAndPayments.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Digits;

@Entity
public class Transakcija implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private StanjeTransakcije stanjeTransakcije;

    @Digits(integer=10, fraction=2)
    private BigDecimal iznosTransakcije;
    
    @Column(nullable = true)
    private String razlog; 
      
    public Transakcija(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StanjeTransakcije getStanjeTransakcije() {
		return stanjeTransakcije;
	}

	public void setStanjeTransakcije(StanjeTransakcije stanjeTransakcije) {
		this.stanjeTransakcije = stanjeTransakcije;
	}

	public BigDecimal getIznosTransakcije() {
		return iznosTransakcije;
	}

	public void setIznosTransakcije(BigDecimal iznosTransakcije) {
		this.iznosTransakcije = iznosTransakcije;
	}

	public String getRazlog() {
		return razlog;
	}

	public void setRazlog(String razlog) {
		this.razlog = razlog;
	}	
}
