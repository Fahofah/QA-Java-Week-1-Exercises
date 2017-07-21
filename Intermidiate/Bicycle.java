
public class Bicycle extends Vehicle {

	boolean eqCharged;

	public Bicycle(int reg,String make, int year, boolean isWorking, boolean eqCharged) {
		super(reg, make, year, isWorking);
		this.eqCharged = eqCharged;

	} 

	public String toString() {
		return super.toString() + "\nEquipment Charged:" + eqCharged + "\n\n";
	}
}
