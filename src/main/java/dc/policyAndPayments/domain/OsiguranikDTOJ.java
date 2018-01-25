package dc.policyAndPayments.domain;

import java.io.Serializable;

public class OsiguranikDTOJ implements Serializable {

    private int id;
    private String brojPasosa;
    private String brojTelefona;
    private OsobaDTOJ osoba;

    public OsiguranikDTOJ(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public OsobaDTOJ getOsoba() {
        return osoba;
    }

    public void setOsoba(OsobaDTOJ osoba) {
        this.osoba = osoba;
    }

    @Override
    public String toString() {
        return "OsiguranikDTOJ{" +
                "id=" + id +
                ", brojPasosa='" + brojPasosa + '\'' +
                ", brojTelefona='" + brojTelefona + '\'' +
                ", osoba=" + osoba +
                '}';
    }
}
