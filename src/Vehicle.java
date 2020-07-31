
public class Vehicle {
	int numberOfWheels;
	String fuelType;
	String regNo;

	public Vehicle() {
		System.out.println("no argument constructor");
	}

	public Vehicle(int innumberOfWheels, String infuelType, String inregNo) {
		numberOfWheels = innumberOfWheels;
		fuelType = infuelType;
		regNo = inregNo;

	}
	void running() {
		System.out.println("the car is running");
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle(6, "diesel", "ka09nb0987");

		System.out.println("the car has " + car.numberOfWheels + " wheels " + " fuel type is " + car.fuelType
				+ " reg no is " + car.regNo);
		car.running();
	}

}
