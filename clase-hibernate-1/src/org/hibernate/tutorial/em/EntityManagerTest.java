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
		entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
	}

	@AfterClass
	public static void tearDown() throws Exception {
		entityManagerFactory.close();
	}

	@Test
	public void testHibernate() {
		// Creamos 3 empleados
		Departamento departamento1 = new Departamento("456", "Sistemas");
		Cliente cliente1 = new Cliente("24852256", "UNGS");
		Proyecto proyecto1 = new Proyecto("Pepito", null, null, cliente1);
		Proyecto proyecto2 = new Proyecto("Carloncho", null, null, cliente1);
		ArrayList<Proyecto> proyectos1 = new ArrayList<Proyecto>();
		proyectos1.add(proyecto1);
		proyectos1.add(proyecto2);

		Empleado empleado1 = new Empleado(123, "Juan", departamento1, proyectos1);
		Empleado empleado2 = new Empleado(124, "Jaimito", departamento1, proyectos1);
		Empleado empleado3 = new Empleado(125, "Charly", departamento1, proyectos1);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(empleado1);
		entityManager.persist(empleado2);
		entityManager.persist(empleado3);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
