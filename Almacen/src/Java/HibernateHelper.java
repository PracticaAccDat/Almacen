package Java;

import javax.management.Query;

import org.hibernate.*;

public class HibernateHelper {
	SessionFactory sesion = SessionFactoryUtil.getSessionFactory();;
	Session session;
	Transaction tx;

	public HibernateHelper() {

	}

	public void insertar(Object obj) {
		session = sesion.openSession();
		tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		session.close();
	}

	public void actualizar(Object obj) {
		session = sesion.openSession();
		tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
	}

	public boolean consultarUsuario(String nombre, String DNI) {
		session = sesion.openSession();
		tx = session.beginTransaction();
		org.hibernate.Query query = session
				.createQuery("select empleados from Empleados as empleados where nombre='"
						+ nombre + "' and dni='" + DNI + "'");
		return query.list().isEmpty();
	}
}
