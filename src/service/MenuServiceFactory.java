package service;

public class MenuServiceFactory {
	public static MenuService getInstance(int choix) {

		switch (choix) {

		case 1:
			return new ListerPizzasService();
			break;

		case 2:
			return new AjouterPizzaService();
			break;

		case 3:
			return new ModifierPizzaService();
			break;

		case 4:
			return new SupprimerPizzaService();
			break;
		}

		return null;

	}
}
