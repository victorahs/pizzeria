package service;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.mockito.Mockito;

import dao.IPizzaDao;
import dao.PizzaMemDao;
import exception.DeletePizzaException;
import exception.UpdatePizzaException;
import pizzeria.model.Pizza;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModifierPizzaServiceTest {

	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();
	//
	// @Test(expected = UpdatePizzaException.class)
	// public void testExecuteUC() throws UpdatePizzaException {
	//
	// systemInMock.provideLines("PIKE");
	// PizzaMemDao dao = new PizzaMemDao();
	// ModifierPizzaService modifierPizzaService = new ModifierPizzaService();
	// modifierPizzaService.executeUC(new Scanner(System.in), dao);
	// }

	@Test(expected = UpdatePizzaException.class)
	public void testExecuteUC() throws UpdatePizzaException {
		IPizzaDao mockedDao = Mockito.mock(IPizzaDao.class);
		// ArrayList<Pizza> piz = new ArrayList<>();
		Mockito.when(mockedDao.findAllPizzas()).thenReturn(new ArrayList<>());
		ModifierPizzaService modifier = new ModifierPizzaService();
		systemInMock.provideLines("PEP");
		modifier.executeUC(new Scanner(System.in), mockedDao);

	}

}
