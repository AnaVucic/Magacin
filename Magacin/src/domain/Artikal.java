package domain;

import java.util.Objects;

public class Artikal {
	
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null)
			throw new NullPointerException("Naziv artikla ne moze biti null vrednost");
		if(naziv.equals(""))
			throw new IllegalArgumentException("Naziv artikla ne moze biti prazan String");
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra < 0)
			throw new IllegalArgumentException("Sifra artikla ne moze biti negativna vrednost");
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis == null)
			throw new NullPointerException("Opis artikla ne moze biti null vrednost");
		if(opis.equals(""))
			throw new IllegalArgumentException("Opis artikla ne moze biti prazan String");
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina < 0)
			throw new IllegalArgumentException("Kolicina artikla ne moze biti negativna vrednost");
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	
	

}
