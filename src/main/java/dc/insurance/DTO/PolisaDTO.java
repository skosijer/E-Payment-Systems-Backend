package dc.insurance.DTO;

import java.util.ArrayList;
import java.util.Date;

import dc.policyAndPayments.domain.VoziloDTO;

public class PolisaDTO {
	
	public ArrayList<OsobaDTO> osiguranici;
	public ArrayList<RizikDTO> riziciPutno;
	public OsobaDTO nosilac;
	public ArrayList<NekretninaDTO> nekretnine;
	public VoziloDTO vozila;
	public int trajanjeOsiguranja;
	public String vrstaPaketa;
	public Date pocetakOsiguranja;

}
