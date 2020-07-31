
public class MethodExample {

	public static void main(String[] args) {
		int a = 10, b = 20;
		sumOfTwo(a, b);
		sumOfTwo(23, 10);
		subOfTwo(1000, 1);
	}

	public static void sumOfTwo(int a, int b) {
		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}

	public static int subOfTwo(int a, int b) {
		int sub = a - b;
		System.out.println("The sub of " + a + " and " + b + " is " + sub);

		return sub;

	}

}
