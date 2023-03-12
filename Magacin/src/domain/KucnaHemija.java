package domain;

import java.time.LocalDate;
import java.util.Objects;

public class KucnaHemija extends Artikal {

	private LocalDate datum;

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		if(datum.isAfter(LocalDate.now()))
			throw new IllegalArgumentException("Datum isteka atrikla ne moze biti datum u buducnosti.");
		this.datum = datum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(datum);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(datum, other.datum);
	}

	@Override
	public String toString() {
		return "KucnaHemija [datum=" + datum + "; " + super.toString() + "]";
	}
	
	
}
