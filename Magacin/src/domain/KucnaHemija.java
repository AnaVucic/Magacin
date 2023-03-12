package domain;

import java.time.LocalDate;

public class KucnaHemija extends Artikal {

	private LocalDate datum;

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	
	
}
