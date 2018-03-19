package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



import pizzeria.model.Pizza;

public class PizzaJpaDao implements IPizzaDao {

	@Override
	public List<Pizza> findAllPizzas() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pizza");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		// TODO Auto-generated method stub
		TypedQuery<Pizza> query = manager.createQuery("FROM pizza", Pizza.class);
		List<Pizza> pizzas = query.getResultList();

		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pizza");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		manager.persist(pizza);

		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pizza");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		TypedQuery<Pizza> query = manager.createQuery("FROM pizza WHERE CODE=:code", Pizza.class);
		query.setParameter("code", codePizza);
		Pizza pizza2 = query.getSingleResult();
		pizza2.setCategorie(pizza.getCategorie());
		pizza2.setCode(pizza.getCode());
		pizza2.setLibelle(pizza.getLibelle());
		pizza2.setPrix(pizza.getPrix());
		manager.persist(pizza2);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		

	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub

	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pizza");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		TypedQuery<Pizza> query = manager.createQuery("FROM pizza WHERE CODE=:code", Pizza.class);
		query.setParameter("code", codePizza);
		int resultat = query.getFirstResult();
		
		
		
		
		
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

}
