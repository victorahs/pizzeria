package service;

import java.util.Scanner;

import dao.IPizzaDao;
import pizzeria.model.Pizza;

/**Class qui permet de lister les pizzas
 * @author ETY0005
 *
 */
public class ListerPizzasService extends MenuService {

	

	@Override
	public void executeUC(Scanner scanner, IPizzaDao dao) {
		// TODO Auto-generated method stub
		for (Pizza p : dao.findAllPizzas()) {
			System.out.println(p.toString());

		}
	}

}
