package pizzeria.model;

public enum CategoriePizza {
	VIANDE ("Viande"), POISSON("Poisson"), SANS_VIANDE("Sans Viande");
	
	private String value;
	private CategoriePizza(String value){
		
		this.value = value;
	}
	
	public String getValue(){
		
		return value;
	}
	
	public static CategoriePizza findByLibelle(String libelle) {
		for(CategoriePizza categorie: values()) {
			if(categorie.getValue().equals(libelle)) {
				return categorie;
			}
		}
		return null;
	}


}
