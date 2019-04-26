package city;

public class City {

	  private String nameCity;
	  private String nameCountry;
	  private int nbreCitizens;
	public City(String nameCity, int nbreCitizens, String nameCountry) {
		super();
		this.nameCity = nameCity;
		this.nameCountry = nameCountry;
		this.nbreCitizens = nbreCitizens;
	}
	public City() {
		super();
	}
	public String getNameCity() {
		return nameCity;
	}
	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}
	public String getNameCountry() {
		return nameCountry;
	}
	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}
	public int getNbreCitizens() {
		return nbreCitizens;
	}
	public void setNbreCitizens(int nbreCitizens) {
		this.nbreCitizens = nbreCitizens;
	}
}
	