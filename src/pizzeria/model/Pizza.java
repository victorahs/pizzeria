package pizzeria.model;

/**
 * @author ETY0005
 * Création de la class Pizza
 *
 */
public class Pizza {
	/** id : int
	 * 
	 */
	int id;
	/** code : String
	 * 
	 */
	String code;
	/** libelle : String
	 * 
	 */
	String libelle;
	/** prix : double
	 * 
	 */
	double prix;
	/** categorie : CategoriePizza
	 * 
	 */
	CategoriePizza categorie;
	
	/** compteur : int
	 * 
	 */
	private static int compteur = 0;
	
	/**Constructer
	 * 
	 * @param code code le la pizza
	 * @param libelle libelle de la pizza
	 * @param prix prix de la pizza
	 * @param categorie categorie de la pizza
	 */

	public Pizza(String code, String libelle, double prix, CategoriePizza categorie  ){
		
		compteur ++;
		this.id = compteur;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
		
	}
	
	/**Constructer
	 * @param id id de la pizza
	 * @param code code de la pizza
	 * @param libelle de la pizza
	 * @param prix prix de la pizza
	 * @param categorie categorie de la pizza
	 */
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

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**Setter
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/** Getter
	 * @return the categorie
	 */
	public CategoriePizza getCategorie() {
		return categorie;
	}

	/**Setter
	 * @param categorie the categorie to set
	 */
	public void setCategorie(CategoriePizza categorie) {
		this.categorie = categorie;
	}

	
	

}
