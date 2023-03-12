package interfejs;

import domain.Artikal;

public interface MagacinInterfejs {
	
	public void dodajAtrikal(Artikal artikal);
	
	public void izbaciArtikal(Artikal artikal);
	
	public Artikal pronadjiArtikal(int sifra);

}
