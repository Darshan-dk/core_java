import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int sum = 0, temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a end number");
		int n = scan.nextInt();
		temp = n;
		do {
			sum += n;
			n--;
		} while (n > 0);
		System.out.println("The sum of natural number in between 0 to " + temp + " is " + sum);

	}

}
