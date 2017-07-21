
public class Users extends People{

	boolean hasBorrowed;
	int borrowId;
	
	public Users(int id, String name, int age, boolean hasBorrowed){
		super(id,name,age);
		this.hasBorrowed=hasBorrowed;
		
	}
	
	public String toString(){
		return ("\nID: " + id +"\nName: " +name+ "\nHas Borrowed: " +hasBorrowed);
	}
}
