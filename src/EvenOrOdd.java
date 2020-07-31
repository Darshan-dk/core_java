
public class EvenOrOdd {

	void EvenOrOdd1(int a) {
		if (a % 2 == 0)
			System.out.println("the number is even");
		else
			System.out.println("the number is odd");

	}

	public static void main(String[] args) {
		EvenOrOdd num = new EvenOrOdd();
		num.EvenOrOdd1(8);
	}

}
