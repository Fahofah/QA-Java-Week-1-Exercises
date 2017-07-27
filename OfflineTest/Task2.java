
public class Task2 {

	public static void main(String args[]) {
		Task2 t2 = new Task2();
		t2.getSandwich("abadbubreadjambread");
	}

	public void getSandwich(String s) {
		int firstOC = s.indexOf("bread");
		int lastOC = s.lastIndexOf("bread");
		int y = 0;
		char[] Sand = new char[s.length()];
		System.out.println("contains sandwich at " + firstOC + " & " + lastOC);
		if (firstOC != lastOC) {
			char[] arrayS = s.toCharArray();
			for (int i = firstOC + 5; i < lastOC; i++) {
				Sand[y] = (arrayS[i]);
				y++;
			}
			System.out.println(Sand);

		}
	}
}
