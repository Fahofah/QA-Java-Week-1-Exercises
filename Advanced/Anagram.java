import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Anagram {

	public void check(HashMap hm) {

		for (Object i : hm.keySet()) {
			String a = i.toString();
			String b = hm.get(i).toString();
			// remove white spaces
			String A = a.replaceAll("\\s", "");
			String B = b.replaceAll("\\s", "");

			boolean isAnag = false;

			if (A.length() != B.length()) {
				System.out.println("**Words should have same length to be considered as anagrams!** " + a + " & " + b
						+ " are NOT!");

			} else {
				// Convert to lower case and then to char array
				char[] arrayA = A.toLowerCase().toCharArray();
				char[] arrayB = B.toLowerCase().toCharArray();

				// sort in alphabetical order
				Arrays.sort(arrayA);
				Arrays.sort(arrayB);

				// compare sorted char arrays
				isAnag = Arrays.equals(arrayA, arrayB);

				if (isAnag) {
					System.out.println(a + " and " + b + " are anagrams!\n");
				} else {
					System.out.println(a + " and " + b + " are NOT anagrams!\n");
				}

			}

		}

	}
}
