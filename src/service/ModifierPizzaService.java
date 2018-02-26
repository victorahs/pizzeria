package service;

import java.util.Scanner;

import dao.IPizzaDao;
import pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService {



	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {
		// TODO Auto-generated method stub
		System.out.println("Veuillez saisir le code de la pizza à  modifier:");
		String codeModif = scanner.next();
		
			

				System.out.println("Veuillez saisir le nouveau code:");
				String codeM = scanner.next();
				

				System.out.println("Veuillez saisir le nouveau nom (sans espace):");
				String libM = scanner.next();
				

				System.out.println("Veuillez saisir le prix:");
				double prixM = scanner.nextDouble();
				dao.updatePizza(codeModif, new Pizza(codeM, libM, prixM));
				
	}

}
