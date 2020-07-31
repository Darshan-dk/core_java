
public class Swapping {

	static void swap(int a, int b) {
		System.out.println("Initial value of a is :" + a + " and b is :" + b);
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping value of a is :" + a + " and b is :" + b);
	}

	public static void main(String[] args) {
		
		swap(10, 20);

	}

}
