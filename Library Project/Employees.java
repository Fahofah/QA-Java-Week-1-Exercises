
public class Employees extends People {

	String role;
	boolean onDuty;

	public Employees(int id, String name, int age, String role, boolean onDuty) {
		super(id,name,age);
		this.role=role;
		this.onDuty=onDuty;
	}
	
	public String toString(){
		return ("\nID: " + id +"\nName: " +name+ "\nRole: " +role+ "\nOn Duty"+ onDuty);
	}
}
