package magacin;

import java.util.ArrayList;
import java.util.List;

import domain.Artikal;
import interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {
	
	private List<Artikal> artikli = new ArrayList<Artikal>();

	@Override
	public void dodajAtrikal(Artikal artikal) {
		if (artikal == null)
			throw new NullPointerException("Artikal koji se unosi ne sme biti null");
		if (artikli.contains(artikal))
			throw new IllegalArgumentException("Duplikat artikla ne moze biti ubacen");
		artikli.add(artikal);		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		artikli.remove(artikal);
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		if(sifra < 0)
			throw new IllegalArgumentException("Sifra za pronalazenje artikla ne moze biti negativna vrednost");
		for(Artikal a: artikli) {
			if(a.getSifra() == sifra)
				return a;
		}
		return null;
	}

}
