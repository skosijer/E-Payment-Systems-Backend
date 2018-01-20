package dc.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dc.insurance.domain.Kategorija;
import dc.insurance.repo.KategorijaRepository;

@Service
public class KategorijaService {

	@Autowired
	private KategorijaRepository kategorijaRepository; 

}
