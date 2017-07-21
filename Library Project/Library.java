import java.util.ArrayList;

public class Library {
	
	ArrayList<Items> iList = new ArrayList<Items>();
	ArrayList<People> pList = new ArrayList<People>();

	public void addItemToList(Items i){
		iList.add(i);
	}
	
	public void addPersonToList(People p){
		pList.add(p);
	}
	
	public void printAllItems(){
		System.out.println("\n__Items List__");
		for(Items i: iList){
			System.out.println(i);
		}
	}
	
	public void printAllPeople(){
		System.out.println("\n__People List__");
		for(People p: pList){
			System.out.println(p);
		}
	}
	
}


