import java.io.FileNotFoundException;
import java.io.IOException;

public class Console {

	public static void main(String[] args) throws IOException {
		Library l = new Library();
		Users u1 = new Users("Matthew", 25, false);
		Users u2 = new Users("Jack", 21, false);
		Books b1 = new Books("The Book of Life", true, "Fiction", "Robert Daniels");
		Employees e1 = new Employees("Martha Rogers", 26, "Librarian", true);
		Maps m1 = new Maps("Mountains and Hills", true, "Leeds", "1:200");
		Magazines g1 = new Magazines("Nat Geo", false, 10.6);

		Filer<Items> fi = new Filer<Items>();
		Filer<People> fp = new Filer<People>();

		l.addItemToList(b1);
		l.addItemToList(m1);
		l.addItemToList(g1);

		l.addPersonToList(u1);
		l.addPersonToList(u2);
		l.addPersonToList(e1);

		l.printList(l.iList);
		l.printList(l.pList);

		l.printAllItems();
		l.printAllPeople();
		l.updatePeople(2);

		l.borrowItem(2);

		fi.filePathWrite = "C:/Users/Administrator/Documents/LibraryItemsList.txt";
		fi.linkFile();
		fi.write(l.getItemList());

		fp.filePathWrite = "C:/Users/Administrator/Documents/LibraryPeopleList.txt";
		fp.linkFile();
		fp.write(l.getPeopleList());

		fi.filePathRead = fi.filePathWrite;
		fi.read();
		fp.filePathRead = fp.filePathWrite;
		fp.read();

		l.printList(fi.iListFromFile);
		l.printList(fp.pListFromFile);

		l.checkOutItem(1);
		l.checkInItem(3);
		l.printAllItems();

		l.removeItem(3);
		l.printAllItems();

		l.removePerson(1);
		l.printAllPeople();
		l.updateItem(1);
		l.printAllItems();
		l.printAllPeople();
		l.printAllPeople();
	}

}
