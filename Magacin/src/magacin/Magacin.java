package magacin;

import java.util.ArrayList;
import java.util.List;

import domain.Artikal;
import interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {
	
	List<Artikal> artikli = new ArrayList<Artikal>();

	@Override
	public void dodajAtrikal(Artikal artikal) {
		if (artikal == null)
			throw new NullPointerException("Artikal koji se unosi ne sme biti null");
		for(Artikal a: artikli) {
			if(a.getNaziv().equals(artikal.getNaziv()))
				throw new IllegalArgumentException("Dva artikla ne smeju imati isti naziv");
		}
		artikli.add(artikal);
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
