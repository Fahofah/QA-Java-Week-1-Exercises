import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {

		makeGuess();

	}

	public static void makeGuess() {

		int xlo = 0;
		int xhi = 100;
		boolean found = false;
		int guess = (xhi + xlo) / 2;
		int prevGuess;
		boolean higher = true;

		System.out.println(guess);

		while (!found) {
			int response = getInput();
			prevGuess = guess;

			switch (response) {

			case 0:
				
				found = true;
				break;
			case 1:
				xhi = guess;
				guess = (xhi + xlo) / 2;

				higher = false;
				break;
			case 2:
				xlo = guess;
				guess = (xhi + xlo) / 2;

				higher = true;
				break;
			case 3:
				xlo = guess;
				guess = (int) ((xhi + xlo) / 2.1);

				higher = true;
				break;
			case 4:
				xhi = guess;
				guess = (int) ((xhi + xlo) / 1.9);

				higher = false;
				break;
			case 5:
				xlo = guess;
				guess = (int) ((xhi + xlo) / 1.6);

				higher = true;
				break;
			case 6:
				xhi = guess;
				guess = (int) ((xhi + xlo) / 2.9);

				higher = false;
				break;
			case 7:
				xlo = guess;
				guess = (int) ((xhi + xlo) / 2.5);
				higher = true;

				higher = false;
				break;
			case 8:
				xhi = guess;
				guess = (int) ((xhi + xlo) / 1.65);

				higher = false;
				break;
			case 9:
				xlo = guess;
				guess = (int) ((xhi + xlo) / 2.35);

				higher = true;
				break;
			case 10:
				xhi = guess;
				guess = (int) ((xhi + xlo) / 1.65);

				higher = false;

			}
	//		System.out.println("test"+guess+" "+higher);
			
				if (higher) {
					if (guess <= prevGuess) {
					guess = prevGuess + 1;
					}
				} else {
					if (guess >= prevGuess) {
						guess = prevGuess - 1;
						}
				}
				

			
			if(!found){
				System.out.println(guess);
			} else {
				System.out.println("Hooraaay!!");
			}
			

		}

	}

	public static int getInput() {
		Scanner s = new Scanner(System.in);
		String hint = s.nextLine();

		int newGuess = 0;

		switch (hint) {

		case "higher":
			return 2;

		case "lower":
			return 1;

		case "higher super hot":
			return 3;
		case "lower super hot":
			return 4;
		case "higher super cold":
			return 5;
		case "lower super cold":
			return 6;
		case "higher freezing":
			return 7;
		case "lower freezing":
			return 8;
		case "higher boiling":
			return 9;
		case "lower boiling":
			return 10;

		case "correct":
			return 0;

		}
		return 11;

	}

}
