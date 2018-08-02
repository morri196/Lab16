package Countries;

public class Countries {
	
	String Countries;
	String Continent;
	
	
	public Countries(String countries, String continent) {
		super();
		Countries = countries;
		Continent = continent;
	}


	public Countries() {
		
	}


	public String getCountries() {
		return Countries;
	}


	public void setCountries(String countries) {
		Countries = countries;
	}


	public String getContinent() {
		return Continent;
	}


	public void setContinent(String continent) {
		Continent = continent;
	}


	@Override
	public String toString() {
		return "Countries [Countries=" + Countries + ", Continent=" + Continent + "]";
	}
	
	

}
