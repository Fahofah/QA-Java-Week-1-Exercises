import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadFromFile {

	private Scanner x;
	
	ArrayList<String> ptr = new ArrayList<String>();
	
	public static void main(String [] arg){
		
		ReadFromFile r = new ReadFromFile();
		
		r.openFile();
		r.readnprint();
		
	}
	
	public void openFile(){
		try{
			x=new Scanner (new File("WriteToMe.txt"));
		}
		catch(Exception e){
			System.out.println("could not find file");
		}
	}
	
	public void readnprint(){
		while(x.hasNext()){
			ptr.add(x.nextLine());
		}
		for(String i: ptr){
			System.out.println(i);
		}
	}
}
