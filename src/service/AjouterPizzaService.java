package service;

import java.util.Scanner;

import dao.IPizzaDao;
import exception.DeletePizzaException;
import exception.SavePizzaException;
import pizzeria.model.CategoriePizza;
import pizzeria.model.Pizza;

/**Class qui ajoute une pizzas
 * @author ETY0005
 *
 */
public class AjouterPizzaService extends MenuService {

	
	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) throws SavePizzaException {
		// TODO Auto-generated method stub
		System.out.println("Veuillez saisir le code:");
		String code = scanner.next();
		if (dao.findPizzaByCode(code) != null) {

			throw new SavePizzaException("La pizza avec le code " + code + " existe déjà");

		}
		System.out.println("Veuillez saisir le nom (sans espace):");
		String lib = scanner.next();
		System.out.println("Veuillez saisir le prix:");
		double prix = scanner.nextDouble();
		System.out.println("Veuillez saisir la catégorie de pizza : viande, sans viande, poisson");
		CategoriePizza categorie = CategoriePizza.findByLibelle(scanner.next());

		dao.saveNewPizza((new Pizza(code, lib, prix, categorie)));

	}

}