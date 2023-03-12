package main;

import java.time.LocalDate;

import domain.Artikal;
import domain.Knjiga;
import domain.KucnaHemija;
import magacin.Magacin;

public class Main {

	public static void main(String[] args) {
		Artikal a1 = new Knjiga();
		a1.setSifra(1);
		a1.setNaziv("Attack on Titan, Volume 1");
		a1.setOpis("Several hundred years ago, humans were nearly exterminated by giants. "
				+ "Giants are typically several stories tall, seem to have no intelligence and "
				+ "who devour human beings. A small percentage of humanity survied barricading "
				+ "themselves in a city protected by walls even taller than the biggest of giants. "
				+ "Flash forward to the present and the city has not seen a giant in over 100 years - "
				+ "before teenager Eren and his foster sister Mikasa witness something horrific as the city "
				+ "walls are destroyed by a super-giant that appears from nowhere. ");
		a1.setKolicina(50);
		System.out.println(a1);
		
		KucnaHemija a2 = new KucnaHemija();
		a2.setSifra(2);
		a2.setNaziv("Domestos");
		a2.setOpis("Cisti jako dobro :)");
		a2.setKolicina(200);
		LocalDate expDate = LocalDate.of(2024, 1, 1);
		a2.setDatum(expDate);
		System.out.println(a2);
		
		Magacin m = new Magacin();
		m.dodajAtrikal(a1);
		m.dodajAtrikal(a2);
		System.out.println(m);
		m.izbaciArtikal(a2);
		System.out.println(m);
		m.dodajAtrikal(a2);
		System.out.println(m.pronadjiArtikal(2));

	}

}
