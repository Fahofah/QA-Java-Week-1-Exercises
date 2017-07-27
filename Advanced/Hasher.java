import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Hasher {
	static HashMap<Integer, String> hm = new HashMap<>();
	static HashMap<String, List<String>> hmSorted = new HashMap<String, List<String>>();
	static HashMap<String, Integer> hmMostAnags = new HashMap<String, Integer>();

	public static void main(String[] args) {

		Hasher hash = new Hasher();

		hash.readFileIntoHash();

		// hash.printHash();
		int max = hash.mostAnags();
		System.out.println("Before Clean\n");
		hash.printHash(hmMostAnags);

		hash.leaveDublicateMax(max);
		System.out.println("\n After Clean\n");
		hash.printHash(hmMostAnags);
		
		hash.compareMaxes();

		

	}

	private void readFileIntoHash() {
		Scanner x = null;
		
		int i = 0;
		String sIn, sSorted;

		try {
			x = new Scanner(new File("wordList.txt"));
		} catch (Exception e) {
			System.out.println("could not find file");
		}

		while (x.hasNext()) {
			sIn = x.nextLine();
			sSorted = sortString(sIn);
			if (hmSorted.containsKey(sSorted)) {
				hmSorted.get(sSorted).add(sIn);
			} else {
				ArrayList<String> tmp = new ArrayList<String>();
				tmp.add(sIn);
				hmSorted.put(sSorted, tmp);
			}

		}
		System.out.println("\n__File Read Complete__\n");

	}

	public void printHash(HashMap hm) {

		Iterator<Entry<String, List<String>>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, List<String>> entry = it.next();
			System.out.println("Key: " + entry.getKey().toString() + " Value: " + entry.getValue());
		}

	}

	public String sortString(String s) {
		String S = s.replaceAll("\\s", "");

		char[] arrayS = S.toLowerCase().toCharArray();

		Arrays.sort(arrayS);
		String sSorted = String.valueOf(arrayS);
		return sSorted;

	}

	public int mostAnags() {
		Iterator<Entry<String, List<String>>> it = hmSorted.entrySet().iterator();
		int max = -1;
		int numAnags = -1;
		String haveMost = null;
		while (it.hasNext()) {
			Entry<String, List<String>> entry = it.next();
			int tmp = entry.getValue().size();
			if (tmp >= numAnags) {
				numAnags = tmp;
				haveMost = entry.getKey().toString();
				hmMostAnags.put(haveMost, numAnags);
			}
		}
		max = Collections.max(hmMostAnags.values());
		System.out.println(haveMost + " has the most anagrams with " + max + " anagrams on record");
		return max;
	}

	public void leaveDublicateMax(int max) {
		Iterator<Entry<String, Integer>> it = hmMostAnags.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			int tmp = entry.getValue();
			if (tmp == max) {
				hmMostAnags.put(entry.getKey(), entry.getValue());

			} else {
				it.remove();

			}
		}
	}

	public void compareMaxes() {
		Iterator<Entry<String, Integer>> it = hmMostAnags.entrySet().iterator();
		List<String> mostAnag = new ArrayList<>();
		int comp = 0;
		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			int wordLength = entry.getKey().length();
			if (wordLength >= comp) {
				mostAnag.add(entry.getKey());
			}
			comp = wordLength;
		}
		for(String i: mostAnag){
		System.out.println("\n"+i);
		}
	}
}
