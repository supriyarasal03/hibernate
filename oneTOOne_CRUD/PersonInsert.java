package oneTOOne_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Stu;

public class PersonInsert {
	
	public static void main(String[] args) {
		
	
	
	Configuration cfg= new Configuration();
	cfg.configure("Hibernate.cfg.xml");
	cfg.addAnnotatedClass(Person.class);
	
	cfg.addAnnotatedClass(Passport.class);
	SessionFactory sf = cfg.buildSessionFactory();
	  Session ss=        sf.openSession();
	  Transaction tr=      ss.beginTransaction();
	  
	  Passport op = new Passport();
	  
	  Person o = new Person();
	  
	  o.setName("rahul");
	  o.setOne_to_One_Passport(op);
	  o.setSalary("94000");
	  op.setPasspost_no(3456); 
	  ss.save(o);

	  tr.commit();
	  ss.close();
}
}