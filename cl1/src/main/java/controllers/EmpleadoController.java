package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {

	public String createEmpleado(String apellido, String nombres, String edad, String sexo, String salario) {

		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class)
				.buildSessionFactory();

		Session session;
		session = sessionFactory.openSession();

		try {

			Empleado empleado;
			empleado = new Empleado(apellido, nombres, edad, sexo, salario);
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();

			sessionFactory.close();

			return "Empleado creado";
		} catch (Exception e) {

			e.printStackTrace();

		}

		return "Error al crear empleado";
	}

	public String deleteEmpleado(int idempleado) {

		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class)
				.buildSessionFactory();

		Session session;
		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idempleado);
			session.delete(empleado);
			session.getTransaction().commit();

			sessionFactory.close();

			return "empleado eliminado correctamente";
		} catch (Exception e) {

			e.printStackTrace();

		}

		return "error al eliminar empleado";
	}

	public String updateEmpleado(int idempleado,String apellido,String nombres) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idempleado);
			empleado.setApellido(apellido);
			empleado.setNombres(nombres);
			session.getTransaction().commit();
			
			sessionFactory.close();
			return "Empleado actualizado correctamente";
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return "Error al actualizar empleado";
	}
	
	public String getEmpleado(int idempleado) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idempleado);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return empleado.toString();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return "Empleado no existe";
		
		
	}
}
