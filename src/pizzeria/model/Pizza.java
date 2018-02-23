package pizzeria.model;

public class Pizza {
	int id;
	String code;
	String libelle;
	double prix;
	
	private static int compteur = 0;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	

}
