package pizzeria.console;


import java.util.Scanner;

import dao.ConnectionBdd;
import dao.IPizzaDao;
import dao.PizzaDaoBase;
import dao.PizzaMemDao;
import exception.PizzaException;
import service.MenuService;
import service.MenuServiceFactory;

/**
 * @author ETY0005
 * Controlleur qui "aiguille" le programme en fonction du choix de l'utilisateur
 *
 */

public class PizzeriaAdminControllerTp4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPizzaDao dao = new PizzaDaoBase();

		Scanner questionUser = new Scanner(System.in);
		int choix = 0;

		do {

			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("5. Remplir le menu");
			System.out.println("99. Sortir");

			System.out.println("Choisissez une option dans le menu ci dessus");

			choix = questionUser.nextInt();

			MenuService ms = MenuServiceFactory.getInstance(choix);
			try {
				ms.executeUC(questionUser, dao);

			} catch (PizzaException e) {
				System.out.println(e.getMessage());
			}

		} while (choix != 99);
		System.out.println("Aurevoir");
	}

}
