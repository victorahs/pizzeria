package pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner questionUser = new Scanner(System.in);
		int sortie = 1;
		while(sortie == 1){
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		
		System.out.println("Choisissez une option dans le menu ci dessus");
		
		int choix = questionUser.nextInt() ;
		
		switch (choix) {
        case 1:  System.out.println("Liste des pizzas");
                 break;
        case 2:  System.out.println("Ajout d'une nouvelel pizza");
                 break;
        case 3:  System.out.println("Suppression d'une pizza");
                 break;
        case 99:  System.out.println("Aurevoir");
                  sortie = 2;
                 break;
		



	}
		}
	}

}
