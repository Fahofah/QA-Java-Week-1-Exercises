
public class Employees extends People {

	String role;
	boolean onDuty;

	public Employees( String name, int age, String role, boolean onDuty) {
		super(name,age);
		this.role=role;
		this.onDuty=onDuty;
	}
	
	public String toString(){
		return ("\nID: " + id +"\nName: " +name+ "\nAge: " + age+ "\nRole: " +role+ "\nOn Duty: "+ onDuty);
	}
}
