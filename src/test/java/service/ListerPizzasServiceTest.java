package service;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.mockito.Mockito;

import dao.IPizzaDao;
import exception.UpdatePizzaException;

public class ListerPizzasServiceTest {
	@Rule
	public TextFromStandardInputStream systemInMock = emptyStandardInputStream();

	@Test
	public void TestExecuteUC() {
		systemInMock.provideLines("1");
		
		IPizzaDao mockedDao = Mockito.mock(IPizzaDao.class);

		Mockito.when(mockedDao.findAllPizzas()).thenReturn(null);

		ListerPizzasService lister = new ListerPizzasService();

		lister.executeUC(new Scanner(System.in), mockedDao);

	}
}
