package main;

import city.City;

public class Main {

	public static void main(String[] args) {
		City v = new City();
		City v1 = new City("Marseille", 123456, "France");       
		City v2 = new City("Rio", 321654, "Brésil");

		System.out.println("\n v = "+v.getNameCity()+" ville de  "+v.getNbreCitizens()+ " habitants se situant en "+v.getNameCountry());
		System.out.println(" v1 = "+v1.getNameCity()+" ville de  "+v1.getNbreCitizens()+ " habitants se situant en "+v1.getNameCountry());
		System.out.println(" v2 = "+v2.getNameCity()+" ville de  "+v2.getNbreCitizens()+ " habitants se situant en "+v2.getNameCountry()+"\n\n");
		      
		/*
		  Nous allons interchanger les Villes v1 et v2
		  tout ça par l'intermédiaire d'un autre objet Ville.        
		*/       
		City temp = new City();
		temp = v1;
		v1 = v2;
		v2 = temp;
		       
		System.out.println(" v1 = "+v1.getNameCity()+" ville de  "+v1.getNbreCitizens()+ " habitants se situant en "+v1.getNameCountry());
		System.out.println(" v2 = "+v2.getNameCity()+" ville de  "+v2.getNbreCitizens()+ " habitants se situant en "+v2.getNameCountry()+"\n\n");

		/*       
		  Nous allons maintenant interchanger leurs noms
		  cette fois par le biais de leurs mutateurs.
		*/   
		v1.setNameCity("Hong Kong");
		v2.setNameCity("Djibouti");
		      
		System.out.println(" v1 = "+v1.getNameCity()+" ville de  "+v1.getNbreCitizens()+ " habitants se situant en "+v1.getNameCountry());
		System.out.println(" v2 = "+v2.getNameCity()+" ville de  "+v2.getNbreCitizens()+ " habitants se situant en "+v2.getNameCountry()+"\n\n");
	}

}
