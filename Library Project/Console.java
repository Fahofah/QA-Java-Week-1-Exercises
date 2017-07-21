
public class Console {

	public static void main(String[] args) {
		Library l = new Library();
		Users u1 = new Users(1, "Matthew", 25, false);
		Books b1 = new Books( "The Book of Life", true, "Fiction", "Robert Daniels");
		Employees e1 = new Employees(2, "Martha Rogers", 26, "Librarian", true);
		Maps m1 = new Maps( "Mountains and Hills", true, "Leeds", "1:200");
		Magazines g1 = new Magazines( "Nat Geo", false, 10.6);

		l.addItemToList(b1);
		l.addItemToList(g1);
		l.addItemToList(m1);
		
		l.addPersonToList(e1);
		l.addPersonToList(u1);
		
		l.printAllItems();
		l.printAllPeople();
	}

}
