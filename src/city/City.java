package city;

public class City {
	  //Stocke le nom de notre ville
	  String nameCity;
	  //Stocke le nom du pays de notre ville
	  String nameCountry;
	  //Stocke le nombre d'habitants de notre ville
	  int nbreCitizens; 
	  
	  //Constructeur par défaut
	  public City(){
	    System.out.println("Création d'une ville !");      
	    nameCity = "Inconnu";
	    nameCountry = "Inconnu";
	    nbreCitizens = 0;
	  } 
}
