package pizzeria.model;

public class Pizza {
	int id;
	String code;
	String libelle;
	double prix;
	CategoriePizza categorie;
	
	private static int compteur = 0;
	
	public Pizza(String code, String libelle, double prix, CategoriePizza categorie  ){
		
		compteur ++;
		this.id = compteur;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
		
	}
	
	public Pizza(int id, String code, String libelle, double prix, CategoriePizza categorie  ){
		
		
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
		
	}
	
	
	public String toString(){
		
		return this.getCode() + "->" + this.getLibelle() + "(" + this.getPrix() + "\u20ac" + ") catégorie de la pizza est : " + this.categorie.getValue();
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
