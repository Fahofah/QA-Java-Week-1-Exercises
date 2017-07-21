package TestClasses;

public class UniqueSum {

	public int imp(int int1, int int2, int int3) {
		int sum;
		if (int1 == int2 & int2 == int3) {
			sum = 0;
		} else if (int2 == int3) {
			int2 = 0;
			sum = int1 + int2 + int3;
		} else if (int1 == int2 | int1 == int3) {
			int1 = 0;
			sum = int1 + int2 + int3;
		} else {
			sum = int1 + int2 + int3;
		}
		return sum;
	}
}
