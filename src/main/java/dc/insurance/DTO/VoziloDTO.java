package dc.policyAndPayments.domain;


import dc.insurance.DTO.RizikDTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class VoziloDTO implements Serializable {

    public String godinaProizvodnje;
    public String brojTablica;
    public String brojSasije;
    public OsobaDTO vlasnik;
    public String markaTip;
    public ArrayList<RizikDTO> rizici;
}
