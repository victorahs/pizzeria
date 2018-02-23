package pizzeria.model;

public class Pizza {
	int id;
	String code;
	String libelle;
	double prix;
	
	static int compteur = 0;
	
	public Pizza(String code, String libelle, double prix  ){
		
		compteur ++;
		this.id = compteur;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		
	}
	
	public Pizza(int id, String code, String libelle, double prix  ){
		
		
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		
	}
	

}
