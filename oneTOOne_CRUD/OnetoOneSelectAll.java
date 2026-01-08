package oneTOOne_CRUD;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class OnetoOneSelectAll {
	public static void main(String[] args) {
		

		Configuration cfg= new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		cfg.addAnnotatedClass(Person.class);
		
		cfg.addAnnotatedClass(Passport.class);
		SessionFactory sf = cfg.buildSessionFactory();
		  Session ss=        sf.openSession();
		  Transaction tr=      ss.beginTransaction();
		  
		  
	        
		Query<Person> q=  ss.createQuery("from OnetoOne_Person ", Person.class );
		   List<Person> l=    q.getResultList();
		  
		   for(Person p : l)
			   
		   {
			   System.out.println(p.getName()+" "+ p.getId()+ " " + p.getSalary()+ " " +p.getOne_to_One_Passport().passpost_no);
		   }
		   
		   tr.commit();
		   ss.close();
	       		  
		  
		  
	}

}
