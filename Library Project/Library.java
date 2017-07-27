import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * 
 * @author Administrator
 * The main archive to hold all the lists of items and people involved with 
 * the library and the functions of operations within the library
 */
public class Library implements Printable {

	public ArrayList<Items> iList = new ArrayList<Items>();				//main list within library to hold the current Items
	public ArrayList<People> pList = new ArrayList<People>();			//main list within library to hold the current People
	private String BookAttrs[] = { "Title", "Genre", "Author" };
	private String MapAttrs[] = { "Title", "Area", "Scale" };
	private String MagaAttrs[] = { "Title", "Volume.Issue" };
	private String UserAttrs[] = { "Name", "Age" };
	private String EmployeeAttrs[] = { "Name", "Age", "Role" };

	
	//add new Item to items list
	public void addItemToList(Items i) {
		iList.add(i);
	}
	//add new person to people list
	public void addPersonToList(People p) {
		pList.add(p);
	}
	//print the list of current available items within the library
	public void printAllItems() {
		System.out.println("\n__Items List__");
		for (Items i : iList) {
			System.out.println(i);
		}
	}
	//print the list of people involved with the library
	public void printAllPeople() {
		System.out.println("\n__People List__");
		for (People p : pList) {
			System.out.println(p);
		}
	}
	// Mark an item as unavailable within library as it has been borrowed
	public void checkOutItem(int id) {
		for (int i = 0; i < iList.size(); i++) {
			if (iList.get(i).reg == id) {
				iList.get(i).inLibrary = false;
			}
		}
	}
	// Check in an item back that has been borrowed
	public void checkInItem(int id) {
		for (int i = 0; i < iList.size(); i++) {
			if (iList.get(i).reg == id) {
				iList.get(i).inLibrary = true;
			}
		}
	}
	//remove an item completely from the list(library)
	public void removeItem(int id) {
		Iterator<Items> itr = iList.iterator();

		while (itr.hasNext()) {
			Items i = itr.next();
			if (i.reg == id) {
				itr.remove();
				System.out.println("\n**Item : " + i.title + " with ID:" + i.reg + " is removed**\n ");
			}
		}
	}
	//remove a person completely from the list (library)	
	public void removePerson(int id) {
		Iterator<People> itr = pList.iterator();

		while (itr.hasNext()) {
			People p = itr.next();
			if (p.id == id) {
				itr.remove();
				System.out.println("\n**Person: " + p.name + " with ID:" + p.id + " is removed**\n ");
			}
		}
	}
	//Change any attribute of an item (e.g. title ,genre etc.)
	public void updateItem(int reg) {
		Scanner x = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		Iterator<Items> itr = iList.iterator();

		while (itr.hasNext()) {
			Items i = itr.next();
			if (i.reg == reg) {
				System.out.println("\nChosen item is:");
				System.out.println(i);
				if (i instanceof Books) {
					System.out.println("\n What will be updated? Please enter chosen number...\n1." + BookAttrs[0]
							+ "\n2." + BookAttrs[1] + "\n3." + BookAttrs[2] + "\n");
					int c = Integer.parseInt(x.nextLine());
					System.out.println("Please enter the new " + BookAttrs[c - 1]);
					String n = a.nextLine();
					switch (c) {
					case 1:
						i.title = n;
						break;
					case 2:
						((Books) i).genre = n;
						break;
					case 3:
						((Books) i).author = n;
						break;

					}
				} else if (i instanceof Maps) {
					System.out.println("\n What will be updated? Please enter chosen number...\n" + MapAttrs[0] + "\n2."
							+ MapAttrs[1] + "\n");
					int c = Integer.parseInt(x.nextLine());
					System.out.println("Please enter the new " + MapAttrs[c - 1]);
					String n = x.nextLine();
					switch (c) {
					case 1:
						i.title = n;
						break;
					case 2:
						((Maps) i).area = n;
						break;

					}
				}

				else if (i instanceof Magazines) {
					System.out.println("\n What will be updated? Please enter chosen number...\n" + MagaAttrs[0]
							+ "\n2." + MagaAttrs[1] + "\n3." + MagaAttrs[2] + "\n");
					int c = Integer.parseInt(x.nextLine());
					System.out.println("Please enter the new " + MagaAttrs[c - 1]);
					String n = x.nextLine();
					switch (c) {
					case 1:
						i.title = n;
						break;
					case 2:
						((Magazines) i).volDotIssue = Double.parseDouble(n);
						break;

					}
				}

			
				System.out.println("\nItem updated\n");

			}

		}

	}
	//Change any attribute of a person (e.g. name ,age etc.)
	public void updatePeople(int id) {
		Scanner x = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		Iterator<People> itr = pList.iterator();

		while (itr.hasNext()) {
			People p = itr.next();
			if (p.id == id) {
				System.out.println("\nChosen person is:");
				System.out.println(p);
				if (p instanceof Users) {
					System.out.println("\n What will be updated about " + pList.get(id - 1).name
							+ " ? Please enter chosen number...\n1." + UserAttrs[0] + "\n2." + UserAttrs[1] + "\n");
					int c = Integer.parseInt(x.nextLine());
					System.out.println("Please enter the new " + UserAttrs[c - 1]);
					String n = a.nextLine();
					switch (c) {
					case 1:
						p.name = n;
						break;
					case 2:
						p.age = Integer.parseInt(n);
						break;

					}
				} else if (p instanceof Employees) {
					System.out.println("\n What will be updated about " + pList.get(id - 1).name
							+ " ? Please enter chosen number...\n1." + EmployeeAttrs[0] + "\n2." + EmployeeAttrs[1]
							+ "\n3." + EmployeeAttrs[2]);
					int c = Integer.parseInt(x.nextLine());
					System.out.println("Please enter the new " + EmployeeAttrs[c - 1]);
					String n = a.nextLine();
					switch (c) {
					case 1:
						p.name = n;
						break;
					case 2:
						p.age = Integer.parseInt(n);
						break;
					case 3:
						((Employees) p).role = n;

					}
				}

				System.out.println("\nPerson updated\n");

			}

		}

	}

	/**
	 * Pass the ID of the user that is borrowing an Item
	 **/
	//Assign an item to the user that is borrowing(checking out) the item
	public void borrowItem(int userID) {

		printList(iList);
		System.out.println("\n Please enter the registration number of the item that " + pList.get(userID - 1).name
				+ " is borrowing ");
		Scanner y = new Scanner(System.in);
		int r = Integer.parseInt(y.nextLine());

		iList.get(r - 1).inLibrary = false;
		((Users) pList.get(userID - 1)).hasBorrowed = true;
		((Users) pList.get(userID - 1)).borrowId = r;
		((Users) pList.get(userID - 1)).borrowedTitle = iList.get(r - 1).title;

	}

	public ArrayList<Items> getItemList() {
		return iList;

	}

	public ArrayList<People> getPeopleList() {
		return pList;

	}
	//Interface for printing any object type of list, eg. people or items
	@Override
	public <T> void printList(ArrayList<T> list) {

		for (T o : list) {
			System.out.println(o);
		}

	}

}
