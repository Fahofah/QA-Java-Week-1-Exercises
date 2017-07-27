
public class Users extends People {

	boolean hasBorrowed;
	int borrowId;
	String borrowedTitle;

	public Users( String name, int age, boolean hasBorrowed) {
		super( name, age);
		this.hasBorrowed = hasBorrowed;

	}

	public String toString() {
		if (!hasBorrowed) {

			return ("\nID: " + id + "\nName: " + name + "\nAge: " + age + "\nHas Borrowed: " + hasBorrowed);
		} else  {

		
			return ("\nID: " + id + "\nName: " + name + "\nAge: " + age + "\nHas Borrowed: " + hasBorrowed + "\nBorrowed Item: "+ borrowedTitle); 
		}
	}
}
