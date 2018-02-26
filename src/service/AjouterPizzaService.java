package service;

import java.util.Scanner;

import dao.IPizzaDao;
import pizzeria.model.Pizza;

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {
		// TODO Auto-generated method stub
		System.out.println("Veuillez saisir le code:");
		String code = scanner.next();
		System.out.println("Veuillez saisir le nom (sans espace):");
		String lib = scanner.next();
		System.out.println("Veuillez saisir le prix:");
		double prix = scanner.nextDouble();

		dao.saveNewPizza((new Pizza(code, lib, prix)));

		
		
	}


}
