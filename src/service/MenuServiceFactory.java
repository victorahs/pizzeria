package service;

public class MenuServiceFactory {
	public static MenuService getInstance(int choix) {

		switch (choix) {

		case 1:
			return new ListerPizzasService();
			

		case 2:
			return new AjouterPizzaService();
			

		case 3:
			return new ModifierPizzaService();
			

		case 4:
			return new SupprimerPizzaService();
			
		}

		return null;

	}
}
