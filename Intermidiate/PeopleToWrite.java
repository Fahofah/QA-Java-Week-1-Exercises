import java.util.ArrayList;

public class PeopleToWrite {

	String name;
	String occupation;
	int age;
	

	public PeopleToWrite(String name, String occupation, int age){
		this.name=name;
		this.occupation=occupation;
		this.age=age;
	}
	
	@Override
	public String toString(){
		return "\r\nName: " + name + " \r\nOccupuation: " + occupation + "\r\nAge: " + age;
	}
}
