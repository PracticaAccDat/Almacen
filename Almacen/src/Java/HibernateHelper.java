package Java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateHelper {
	SessionFactory sesion= SessionFactoryUtil.getSessionFactory();;
	Session session;
	Transaction tx;
	 public HibernateHelper() {
		
	}
	 public void insertar(Object obj){		 
		 session = sesion.openSession();
		 tx = session.beginTransaction();
		 session.save(obj);
		 tx.commit();
		 session.close();
	 }
	 public void actualizar(Object obj){
		 session = sesion.openSession();
		 tx = session.beginTransaction();
		 session.update(obj);
		 tx.commit();
		 session.close();
	 }
	 
}
