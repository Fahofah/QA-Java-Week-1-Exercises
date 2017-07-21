package TestClasses;

public class TooHot {
	
	public  boolean check(int temp, boolean isSummer) {
		int tHi = 90;
		int tLo = 60;

		if (isSummer) {
			tHi = 100;
		}

		if (temp >= tLo & temp <= tHi) {
			return true;
		} else {
			return false;
		}
	}

}
