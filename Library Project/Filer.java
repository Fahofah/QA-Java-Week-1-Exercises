import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
/**
 * 
 * @author Administrator
 * IO file handling
 * Implements Generic methods for ArrayList access
 * @param <T>
 */
public class Filer<T> {

	String filePathWrite;
	String filePathRead;
	public ArrayList<Items> iListFromFile = new ArrayList<Items>(); // separate file to hold items read from the file															 
	public ArrayList<People> pListFromFile = new ArrayList<People>(); // separate file to hold people read from the file
	
	// Goes to the spceifed path and creates the specified file if not already existing. Also returns relevant end-result info.
	public void linkFile() {
		try {
			File file = new File(filePathWrite);
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

	// Writes the contents of the list that has been sent trough to the linked
	// file.
	// Inserts an additional tag(line) of the type of the object before each
	// object
	public void write(ArrayList<T> list) throws IOException {
		BufferedWriter bfrW = new BufferedWriter(new FileWriter(filePathWrite));
		for (T i : list) {
			if (i instanceof Books) {
				bfrW.write("\r\nBook," + ((Books) i).reg + "," + ((Books) i).title + "," + ((Books) i).inLibrary + ","
						+ ((Books) i).genre + "," + ((Books) i).author);
			} else if (i instanceof Maps) {
				bfrW.write("\r\nMap," + ((Maps) i).reg + "," + ((Maps) i).title + "," + ((Maps) i).inLibrary + ","
						+ ((Maps) i).area + "," + ((Maps) i).scale);
			} else if (i instanceof Magazines) {
				bfrW.write("\r\nMagazine," + ((Magazines) i).reg + "," + ((Magazines) i).title + ","
						+ ((Magazines) i).inLibrary + "," + ((Magazines) i).volDotIssue);
			} else if (i instanceof Users) {
				bfrW.write("\r\nUser," + ((Users) i).id + "," + ((Users) i).name + "," + ((Users) i).age + ","
						+ ((Users) i).hasBorrowed + "," + ((Users) i).borrowedTitle);
			} else if (i instanceof Employees) {
				bfrW.write("\r\nEmployee," + ((Employees) i).id + "," + ((Employees) i).name + "," + ((Employees) i).age
						+ "," + ((Employees) i).role + "," + ((Employees) i).onDuty);
			}
		}
		bfrW.close();
	}

	// reads contents of the linked file, sorts and separates them according to
	// the csv system and calls placeInput method
	public void read() throws IOException {
		BufferedReader bfrR = new BufferedReader(new FileReader(filePathRead));
		String line = null;
		String[] lines = new String[6];
		String[] words = new String[25];
		String totalInput = "";
		while ((line = bfrR.readLine()) != null) {
			totalInput += line + "\n";

		}

		lines = totalInput.split("\n");

		for (int y = 0; y < lines.length; y++) {
			System.out.println(lines[y]);
			words = lines[y].split(",");
			placeInput(words);

		}
		bfrR.close();
	}

	// Creates new instances of relevant classes and puts them into the relevant
	// lists
	public void placeInput(String[] words) {
		switch (words[0]) {
		case "Book":
			Books b = new Books(words[2], Boolean.parseBoolean(words[3]), words[4], words[5]);
			iListFromFile.add(b);
			break;
		case "Map":
			Maps m = new Maps(words[2], Boolean.parseBoolean(words[3]), words[4], words[5]);
			iListFromFile.add(m);
			break;
		case "Magazine":
			Magazines mg = new Magazines(words[2], Boolean.parseBoolean(words[3]), Double.parseDouble(words[4]));
			iListFromFile.add(mg);
			break;
		case "User":
			Users u = new Users(words[2], Integer.parseInt(words[3]), Boolean.parseBoolean(words[4]));
			pListFromFile.add(u);
			break;
		case "Employee":
			Employees e = new Employees(words[2], Integer.parseInt(words[3]), words[4], Boolean.parseBoolean(words[5]));
			pListFromFile.add(e);
			break;

		}
	}
}
