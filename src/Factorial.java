import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1, i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = scan.nextInt();
		if (n < 0) {
			System.out.println("the negetive number does not have factorials");
		} else {
			do {
				fact = fact * i;
				i++;
			} while (i <= n);
			System.out.println("the factorial of " + n + " is:" + fact);
		}
	}

}
