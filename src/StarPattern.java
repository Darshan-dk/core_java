import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {

		int i, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of row");
		int n = scan.nextInt();

		for (i = n; i >= 0; i--) {
			for (j = 0; j < i; j++) {

				System.out.print("*");

			}
			System.out.println("");

		}
	}

}
