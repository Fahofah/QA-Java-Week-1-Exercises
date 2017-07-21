import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

	
		WriteToFile f = new WriteToFile();
		f.linkFile("C:/Users/Administrator/Documents/WrittenFile.txt");

		PeopleToWrite p1 = new PeopleToWrite("Jack", "Gardenner", 24);
		PeopleToWrite p2 = new PeopleToWrite("Ron", "Painter", 32);
		PeopleToWrite p3 = new PeopleToWrite("Romeo", "Brick layer", 28);

		ArrayList<PeopleToWrite> ptw = new ArrayList<PeopleToWrite>();

		ptw.add(p1);
		ptw.add(p2);
		ptw.add(p3);
		WriteToFile write = new WriteToFile();
		write.write(ptw);
	}

	public void write(ArrayList<PeopleToWrite> p) throws FileNotFoundException {

		PrintWriter print_ = new PrintWriter("WriteToMe.txt");
		for (PeopleToWrite person : p) {
			print_.println(person);

		}
		print_.close();
	}
	
	public void linkFile(String path){
		try {
			File file = new File(path);
			boolean i = file.createNewFile();
			if (i) {
				System.out.println("File created");
			} else {
				System.out.println("File already exists");
			}
		}

		catch (Exception e) {
			System.out.println("The file path cannot be found");

		}
	}

}
