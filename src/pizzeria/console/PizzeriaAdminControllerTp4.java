package pizzeria.console;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import dao.IPizzaDao;
import dao.PizzaMemDao;
import pizzeria.model.Pizza;
import service.AjouterPizzaService;
import service.ListerPizzasService;
import service.MenuService;
import service.MenuServiceFactory;
import service.ModifierPizzaService;

public class PizzeriaAdminControllerTp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPizzaDao dao = new PizzaMemDao();

		Scanner questionUser = new Scanner(System.in);
		int choix = 0;

		do {
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			System.out.println("Choisissez une option dans le menu ci dessus");

			choix = questionUser.nextInt();
			
			MenuService ms =  MenuServiceFactory.getInstance(choix);
			ms.executeUC(questionUser, dao);
//			switch (choix) {
//			case 1:
//				ListerPizzasService listerPizzas = new ListerPizzasService();
//				listerPizzas.executeUC(questionUser, dao);
//				
//				
//
//				break;
//			case 2:
//				AjouterPizzaService ajouterPizzaService = new AjouterPizzaService();
//				ajouterPizzaService.executeUC(questionUser, dao);
//
//				break;
//			case 3:
//				
//				ModifierPizzaService modifierPizzaService = new ModifierPizzaService();
//				modifierPizzaService.executeUC(questionUser, dao);
//
//					
//				
//
//				break;
//
//			case 4:
//
//				System.out.println("Veuillez saisir le code de la pizza à supprimer:");
//				String codeSupr = questionUser.next();
//
//				dao.deletePizza(codeSupr);
//
//				break;
//
//			}
		} while (choix != 99);
		System.out.println("Aurevoir");
	}

}
