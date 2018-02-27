package service;

import java.util.Scanner;

import dao.IPizzaDao;
import exception.PizzaException;

public abstract class MenuService {
	
	public abstract void executeUC(Scanner scanner, IPizzaDao dao) throws PizzaException;
		
		
		
	
	

} 
