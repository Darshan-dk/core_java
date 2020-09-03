import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		{
			int i, j;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number of row");
			int n = scan.nextInt();

			for (i = 0; i <= n; i++) {
				for (j = 0; j < i; j++) {

					System.out.print(i);

				}
				System.out.println("");

			}

			for (i = n; i >0; i--) {
				for (j = 0; j < i; j++) {

					System.out.print(i);

				}
				System.out.println("");

		}

	}
}
}
