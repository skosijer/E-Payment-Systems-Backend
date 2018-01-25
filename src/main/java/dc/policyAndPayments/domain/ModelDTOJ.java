package dc.policyAndPayments.domain;

import java.io.Serializable;

public class ModelDTOJ implements Serializable {

    private int id;
    private String ime;
    private MarkaDTOJ marka;

    public ModelDTOJ(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String name) {
        this.ime = name;
    }

    public MarkaDTOJ getMarka() {
        return marka;
    }

    public void setMarka(MarkaDTOJ marka) {
        this.marka = marka;
    }
}
