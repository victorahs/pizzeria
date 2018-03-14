package service;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import dao.PizzaMemDao;
import exception.DeletePizzaException;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import java.awt.Point;
import java.util.Scanner;

import org.junit.Test;

public class SupprimerPizzaServiceTest {
	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();

	@Test(expected = DeletePizzaException.class)
	public void testExecuteUC() throws DeletePizzaException {

		systemInMock.provideLines("Mock");
		PizzaMemDao dao = new PizzaMemDao();
		SupprimerPizzaService suppr = new SupprimerPizzaService();

		suppr.executeUC(new Scanner(System.in), dao);

	}

	@Test
	public void testExecuteUCgood() throws DeletePizzaException {

		PizzaMemDao dao = new PizzaMemDao();
		SupprimerPizzaService suppr = new SupprimerPizzaService();

		systemInMock.provideLines("PEP");

		suppr.executeUC(new Scanner(System.in), dao);
		assertEquals(7, dao.findAllPizzas().size());

	}

}
