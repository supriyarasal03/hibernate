package oneTOOne_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne_Delete {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Person.class);
		
		cfg.addAnnotatedClass(Passport.class);
		SessionFactory sf = cfg.buildSessionFactory();
		  Session ss=        sf.openSession();
		  Transaction tr=      ss.beginTransaction();
		  
		  int id=5;
		  Person op=  ss.load(Person.class, id);
		  
		  ss.remove(op);
		  
		      
		  tr.commit();
		  ss.close();
		  
	}

}
