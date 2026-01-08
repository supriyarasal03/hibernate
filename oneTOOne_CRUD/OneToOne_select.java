package oneTOOne_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne_select {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Person.class);
		
		cfg.addAnnotatedClass(Passport.class);
		SessionFactory sf = cfg.buildSessionFactory();
		  Session ss=        sf.openSession();
		  Transaction tr=      ss.beginTransaction();
		  
		  int id=2;
		  Person op=     ss.load(Person.class, id);
		  System.out.println(op.getId());
		  System.out.println(op.getName());
		  System.out.println(op.getSalary());
		  System.out.println(op.getOne_to_One_Passport().getPasspost_no());
		
		  
		  
		  tr.commit();
		  ss.close();
	}

}
