
public class Bike {

	String color, type;//instance variable.
	double price;

	Bike() {
		System.out.println("The bike object is created");

	}

	void start() {
		System.out.println("the bike is starting");
	}

	void stop() {
		System.out.println("the bike is stopped");
	}

	public static void main(String[] args) {
		Bike BMWbike = new Bike();
		BMWbike.color = "black";
		BMWbike.type = "cruiser";
		BMWbike.price = 150000;

		System.out.println("color of the bike is :" + BMWbike.color);
		System.out.println("Type of the bike is :" + BMWbike.type);
		System.out.println("price of the bike is :" + BMWbike.price);

		BMWbike.start();
		BMWbike.stop();

	}

}
