package service;

import java.util.Scanner;

import dao.IPizzaDao;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {
		// TODO Auto-generated method stub
		System.out.println("Veuillez saisir le code de la pizza à supprimer:");
		String codeSupr = scanner.next();

		dao.deletePizza(codeSupr);
	}



}
