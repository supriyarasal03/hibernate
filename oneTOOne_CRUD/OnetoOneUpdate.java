package oneTOOne_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneUpdate {
public static void main(String[] args) {
	
	
	Configuration cfg= new Configuration();
	cfg.configure("Hibernate.cfg.xml");
	cfg.addAnnotatedClass(Person.class);
	
	cfg.addAnnotatedClass(Passport.class);
	SessionFactory sf = cfg.buildSessionFactory();
	  Session ss=        sf.openSession();
	  Transaction tr=      ss.beginTransaction();
	  
	  //int id=1;
	  
	  //update one table
	           // One_to_One_Passport  op= ss.load(One_to_One_Passport.class, id);
	         //  op.setPasspost_no(23456);
	          //  ss.merge(op);
	  
	  
	  
	  //update with two table
	  int id=1;
	  Person op= ss.get(Person.class, id);
	  op.setSalary("3212");
	  op.getOne_to_One_Passport().setPasspost_no(345678);
	      
	  
	  
	  
	  tr.commit();
	  ss.close();
}
}
