package dc.policyAndPayments.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Uplata implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private int idNarudzbine;
    
    
    
}