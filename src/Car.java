
public class Car {
	String color, type;
	int price;

	Car() {
		System.out.println("car is created");
	}

	void start() {
		System.out.println("the car is starting");
	}

	void breaking() {
		System.out.println("the car is breaking");
	}

	void stop() {
		System.out.println("car is stoping");
	}

	public static void main(String[] args) {
		Car audicar = new Car();
		audicar.color = " black";
		audicar.type = " SUV";
		audicar.price = 5000000;

		System.out.println("color" + audicar.color);
		System.out.println("type" + audicar.type);
		System.out.println("price" + audicar.price);

		audicar.start();
		audicar.breaking();
		audicar.stop();
	}

}
