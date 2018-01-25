package dc.policyAndPayments.domain;


import java.io.Serializable;

public class NekretninaDTOJ implements Serializable {

    private int id;
    private OsobaDTOJ osoba;

    public NekretninaDTOJ(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OsobaDTOJ getOsoba() {
        return osoba;
    }

    public void setOsoba(OsobaDTOJ osoba) {
        this.osoba = osoba;
    }

}
