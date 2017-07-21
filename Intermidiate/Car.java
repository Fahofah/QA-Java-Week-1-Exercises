
public class Car extends Vehicle {

	String fuelType;
	double fuelEff;

	public Car(int reg, String make, int year, boolean isWorking, String fuelType, double fuelEff) {
		super(reg, make, year, isWorking);
		this.fuelType = fuelType;
		this.fuelEff = fuelEff;

	}

	public String toString() {
		return super.toString()+ "\nFuel Efficiency" + fuelEff + "" + "\n\n";
	}

}
