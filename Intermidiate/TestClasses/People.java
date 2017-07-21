package TestClasses;

public class People {
	 public String name;
	 public int age;
	 public String jobTitle;

	
	public People(String s, int i, String j){
		setName(s);
		setAge(i);
		
		
	}
	public People(){}
	
	
	public void setName(String s){
		this.name=s;
	}
	public void setAge(int i){
		this.age=i;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
		
	}
	
	public String toString() {
		return "Name: " + name + " \n" + " Age: " + age + " \n" + "Job Title: " + jobTitle + "\n\n";
	}
}

