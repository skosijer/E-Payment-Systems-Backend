package dc.insurance.DTO;

public class RizikDTO {
	
  public int idRizik;
  public String vrednost;
  public int kolicina;


  @Override
  public String toString() {
    return "RizikDTO{" +
            "idRizik=" + idRizik +
            ", vrednost='" + vrednost + '\'' +
            ", kolicina=" + kolicina +
            '}';
  }
}
