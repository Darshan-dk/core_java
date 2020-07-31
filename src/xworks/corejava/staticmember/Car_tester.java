package xworks.corejava.staticmember;

public class Car_tester {

	public static void main(String[] args) {
		System.out.println("the brand of car is"+Car.brand);
		Car swift=new Car("swift",1000000);
		swift.display();
	}

}
