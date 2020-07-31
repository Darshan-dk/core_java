
public class ArithmeticOpp {

	public static void main(String[] args) {
		int a = 10, b = 20;
		sumOfTwo(a, b);
		subOfTwo(1000, 1);
		multOfTwo(34, 6);
		divOfTwo(100, 10);
		modOfTwo(50, 7);
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

	public static void multOfTwo(int a, int b) {
		int mult = a * b;
		System.out.println("The mult of " + a + " and " + b + " is " + mult);

	}

	public static int divOfTwo(int a, int b) {
		int div = a / b;
		System.out.println("The div of " + a + " and " + b + " is " + div);
		return div;
	}

	public static int modOfTwo(int a, int b) {
		int mod = a % b;
		System.out.println("The mod of " + a + " and " + b + " is " + mod);
		return mod;
	}

}
