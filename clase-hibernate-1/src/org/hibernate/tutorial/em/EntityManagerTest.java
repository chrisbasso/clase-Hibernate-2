package org.hibernate.tutorial.em;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntityManagerTest {
	private static EntityManagerFactory entityManagerFactory;

	@BeforeClass
	public static void setUp() throws Exception {
		entityManagerFactory = Persistence
				.createEntityManagerFactory("org.hibernate.tutorial.jpa");
	}

	@AfterClass
	public static void tearDown() throws Exception {
		entityManagerFactory.close();
	}

	@Test
	public void testHibernate() {
		// Creamos un cliente con su dirección
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();
		entityManager.getTransaction().begin();

		Departamento departamento1 = new Departamento("456", "Sistemas");

		Proyecto proyecto1 = new Proyecto("Pepito", null);
		Proyecto proyecto2 = new Proyecto("Carloncho", null);
		ArrayList<Proyecto> proyectos1 = new ArrayList<Proyecto>();
		proyectos1.add(proyecto1);
		proyectos1.add(proyecto2);

		Empleado empleado1 = new Empleado(123, "Juan", departamento1, proyectos1);
		Empleado empleado2 = new Empleado(124, "Jaimito", departamento1, proyectos1);
		Empleado empleado3 = new Empleado(125, "Charly", departamento1, proyectos1);

		entityManager.persist(empleado1);
		//entityManager.persist(empleado2);
		//entityManager.persist(empleado3);
		entityManager.getTransaction().commit();
		entityManager.close();

		// y los recuperamos.
//		entityManager = entityManagerFactory.createEntityManager();
//		entityManager.getTransaction().begin();
////		List<Cliente> result = entityManager.createQuery("from Cliente",
////				Cliente.class).getResultList();
////		for (Cliente cliente : result) {
////			System.out.println(cliente.getRazonSocial() + " "
////					+ cliente.getDir().getDomicilio());
////		}
//		entityManager.getTransaction().commit();
//		entityManager.close();
	}

}
