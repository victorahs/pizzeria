package dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import pizzeria.model.CategoriePizza;
import pizzeria.model.Pizza;

public class PizzaMemDaoTest {

	@Test
	public void testFindAllPizzas() {
		PizzaMemDao dao = new PizzaMemDao();

		assertEquals(8, dao.findAllPizzas().size());
	}

	@Test
	public void testSaveNewPizza() {

		PizzaMemDao dao = new PizzaMemDao();
		Pizza p = new Pizza("REM", "remin", 14.00, CategoriePizza.POISSON);
		dao.saveNewPizza(p);
		assertEquals(9, dao.findAllPizzas().size());
	}

	@Test
	public void testUpdatePizza() {

		PizzaMemDao dao = new PizzaMemDao();

		Pizza p = new Pizza("REM", "remin", 14.00, CategoriePizza.POISSON);
		dao.updatePizza("PEP", p);
		Pizza piz = dao.findAllPizzas().get(0);
		assertEquals("REM", piz.getCode());
		assertEquals("remin", piz.getLibelle());
		assertThat(14.00, is(piz.getPrix()));
		
		

	}

	@Test
	public void testDeletePizza() {

		PizzaMemDao dao = new PizzaMemDao();
		dao.deletePizza("PEP");
		int size = dao.findAllPizzas().size();
		assertEquals(7, size);

		dao.deletePizza(" ");
		assertEquals(7, 7);

	}

	@Test
	public void testFindPizzaByCode() {
		PizzaMemDao dao = new PizzaMemDao();

		assertNotNull(dao.findPizzaByCode("PEP"));
		assertNull(dao.findPizzaByCode("CAM"));

	}

	@Test
	public void testFindIndexPizzaByCode() {
		PizzaMemDao dao = new PizzaMemDao();

		assertNotNull(dao.findPizzaByCode("PEP"));
		assertEquals(-1, dao.findIndexPizzaByCode("JPP"));

	}

	@Test
	public void testPizzaExists() {

		PizzaMemDao dao = new PizzaMemDao();
		assertTrue(dao.pizzaExists("PEP"));
		assertFalse(dao.pizzaExists("POP"));

	}

}
