import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i = 0, rem = 0;
		boolean flag=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int n = scan.nextInt();
		scan.close();
		if ((n == 0) || (n == 1)) {
			System.out.println("this number is not a prime number.");
		}
		if (n % 2 == 0) {
			System.out.println("this number is not a prime number.");

		} else {
			for (i = 2; i < n; i++) {
				rem = n % i;
				if (rem == 0) {
					flag=false;
					System.out.println("this number is not a prime number");
					break;
				}
			}
			if (flag)
				System.out.println("this is a prime number"); 

		}

	}

}
