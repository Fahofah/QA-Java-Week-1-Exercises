
public class ReverseFactorial {

	public static void main(String[] arg) {
		
		int [] numSet= {3628800,479001600,6,18};

		
		for(int i=0;i<numSet.length;i++){
			System.out.println(checkFactorial(numSet[i]));
		}
		

	}

	public static String checkFactorial(int x) {
		int x2 = x;
		boolean cont = true;
		int i = 2;

		while (cont) {
			int temp = x / i;
			if (x % i > 0) {
				cont = false;
				return ""+x2+ " NONE";
			}

			x = temp;

			if (x == 1) {
				return "" + x2 + " = " + i + "!";
			}
			i++;
		}

		return "false";
	}
}
