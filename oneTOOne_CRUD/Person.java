package oneTOOne_CRUD;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String salary;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passport_id" , referencedColumnName = "id")
	private Passport  one_to_One_Passport ;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public Passport getOne_to_One_Passport() {
		return one_to_One_Passport;
	}


	public void setOne_to_One_Passport(Passport one_to_One_Passport) {
		this.one_to_One_Passport = one_to_One_Passport;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(int id, String name, String salary, Passport one_to_One_Passport) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.one_to_One_Passport = one_to_One_Passport;
	}


	@Override
	public String toString() {
		return "OnetoOne_Person [id=" + id + ", name=" + name + ", salary=" + salary + ", one_to_One_Passport="
				+ one_to_One_Passport + "]";
	}
	
	
	
	
	
	
	

}
