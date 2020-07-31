import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		int sum = 0, temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a end number");
		int n = scan.nextInt();
		
		temp = n;
		do {
			if (n % 2 != 0) {
				sum += n;
			}
			n--;

		} while (n > 0);
		System.out.println("The sum of odd number in between 0 and " + temp + " is " + sum);

	}

}
