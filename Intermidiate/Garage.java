import java.util.*;

public class Garage {
	ArrayList<Vehicle> vList = new ArrayList<Vehicle>();

	public void addToList(Vehicle i) {

		vList.add(i);

	}

	public void printVList() {

		/*for (int i = 0; i < vList.size(); i++) {
			System.out.println(vList.get(i));

		}
		*/
		
		for(Vehicle v: vList){
			System.out.println(v);
		}
	}

	public void calCost() {

		for(Vehicle v: vList){
			if (v.isWorking == false) {

				if (v instanceof Car) {
					v.fixprice = (2017 - v.year) * 40;
				} else if (v instanceof Motorcycle) {
					v.fixprice = (2017 - v.year) * 20;
				} else if (v instanceof Bicycle) {
					v.fixprice = (2017 - v.year + 5) * 5;
				}
				
				System.out.println(v.make + " " + v.year + " fixing cost is " + v.fixprice);
			}
		}
/*
		for (int i = 0; i < vList.size(); i++) {

			if (vList.get(i).isWorking == false) {

				if (vList.get(i) instanceof Car) {
					vList.get(i).fixprice = (2017 - vList.get(i).year) * 40;
				} else if (vList.get(i) instanceof Motorcycle) {
					vList.get(i).fixprice = (2017 - vList.get(i).year) * 20;
				} else if (vList.get(i) instanceof Bicycle) {
					vList.get(i).fixprice = (2017 - vList.get(i).year + 5) * 5;
				}
				
			}
			
				System.out.println(vList.get(i).make + " " + vList.get(i).year + " fixing cost is " + vList.get(i).fixprice);
			
		}*/
		
		System.out.println("\n");
	}

	public void removeVehicle(int r) {

		for (int i = 0; i < vList.size(); i++) {

			if (vList.get(i).reg == r) {
				System.out
						.println("\n ** " + vList.get(i).make + " with registration number " + r + " is deleted***\n");
				vList.remove(i);

			}

		}

	}

	public void clearGarage() {
		vList.clear();
		System.out.println("\n***Garage Cleared***\n");
	}
	
	public void itRemove(int r){
		Iterator<Vehicle> itr = vList.iterator();
		
		while (itr.hasNext()){
			Vehicle vehicle = itr.next();
			if(vehicle.reg==r){
				itr.remove();
				System.out.println("Vehicle with registration number " + vehicle.reg + " is removed\n ");
			}
				
			
		}
	}

}
