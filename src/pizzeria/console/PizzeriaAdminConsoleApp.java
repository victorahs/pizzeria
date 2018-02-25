package pizzeria.console;

import java.util.Arrays;
import java.util.Scanner;

import pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Pizza[] pizzas = new Pizza[8];

		pizzas[0] = new Pizza(0, "PEP", "P�p�roni", 12.50);
		pizzas[1] = new Pizza(1, "MAR", "Margherita", 14.00);
		pizzas[2] = new Pizza(2, "REIN", "La Reine", 11.50);
		pizzas[3] = new Pizza(3, "FRO", "La 4 fromages", 12.00);
		pizzas[4] = new Pizza(4, "CAN", "La Cannibale", 12.50);
		pizzas[5] = new Pizza(5, "SAV", "La savoyarde", 13.00);
		pizzas[6] = new Pizza(6, "ORI", "L'orientale", 13.50);
		pizzas[7] = new Pizza(7, "IND", "L'indienne", 14.00);

		Scanner questionUser = new Scanner(System.in);
		int choix = 0;

		do {
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre � jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			System.out.println("Choisissez une option dans le menu ci dessus");

			choix = questionUser.nextInt();

			switch (choix) {
			case 1:
				for (int i = 0; i < pizzas.length; i++) {
					System.out.println(pizzas[i].getCode() + "->" + pizzas[i].getLibelle() + "(" + pizzas[i].getPrix()
							+ "\u20ac" + ")");

				}

				break;
			case 2:
				System.out.println("Veuillez saisir le code:");
				String code = questionUser.next();
				System.out.println("Veuillez saisir le nom (sans espace):");
				String lib = questionUser.next();
				System.out.println("Veuillez saisir le prix:");
				double prix = questionUser.nextDouble();

				pizzas = Arrays.copyOf(pizzas, pizzas.length + 1);
				pizzas[pizzas.length - 1] = new Pizza(code, lib, prix);

				break;
			case 3:
				System.out.println("Modif d'une pizza");
				for (int i = 0; i < pizzas.length; i++) {
					System.out.println(pizzas[i].getCode() + "->" + pizzas[i].getLibelle() + "(" + pizzas[i].getPrix()
							+ "\u20ac" + ")");

				}
				System.out.println("Veuillez saisir le code de la pizza � modifier:");
				String codeModif = questionUser.next();
				for (int i = 0; i < pizzas.length; i++) {
					if (pizzas[i].getCode().equals(codeModif)) {

						System.out.println("Veuillez saisir le nouveau code:");
						String codeM = questionUser.next();
						pizzas[i].setCode(codeM);

						System.out.println("Veuillez saisir le nouveau nom (sans espace):");
						String libM = questionUser.next();
						pizzas[i].setLibelle(libM);

						System.out.println("Veuillez saisir le prix:");
						double prixM = questionUser.nextDouble();
						pizzas[i].setPrix(prixM);

					}
				}

				break;

			case 4:

				int i = 0;
				System.out.println("Veuillez saisir le code de la pizza � supprimer:");
				String codeSupr = questionUser.next();

				while ((i < pizzas.length) && (!pizzas[i].getCode().equals(codeSupr))) {
					i++;

				}
				while (i < pizzas.length - 1) {
					pizzas[i] = pizzas[i + 1];
					i++;

				}

				pizzas = Arrays.copyOf(pizzas, pizzas.length - 1);

				break;

			}
		} while (choix != 99);
		System.out.println("Aurevoir");
	}

}
