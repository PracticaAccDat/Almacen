package Java;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private static final SessionFactory sessionFactory;
		static{
			try {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			} catch (Throwable ex) {
				System.err.println("Innitial session factory creation failed."+ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}