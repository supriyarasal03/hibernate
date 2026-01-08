package oneTOOne_CRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	long passpost_no;
	
	@OneToOne(mappedBy = "one_to_One_Passport")
	private Person  onetoOne_Person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPasspost_no() {
		return passpost_no;
	}

	public void setPasspost_no(long passpost_no) {
		this.passpost_no = passpost_no;
	}

	public Person getOnetoOne_Person() {
		return onetoOne_Person;
	}

	public void setOnetoOne_Person(Person onetoOne_Person) {
		this.onetoOne_Person = onetoOne_Person;
	}

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passport(int id, long passpost_no, Person onetoOne_Person) {
		super();
		this.id = id;
		this.passpost_no = passpost_no;
		this.onetoOne_Person = onetoOne_Person;
	}

	@Override
	public String toString() {
		return "One_to_One_Passport [id=" + id + ", passpost_no=" + passpost_no + ", onetoOne_Person=" + onetoOne_Person
				+ "]";
	}
	
	
	
	
	

}
