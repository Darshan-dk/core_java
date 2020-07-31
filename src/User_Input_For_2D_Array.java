import java.util.Scanner;

public class User_Input_For_2D_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of rows ");
		int m = scan.nextInt();
		System.out.println("enter the number of colomn ");
		int n = scan.nextInt();
		int i, j = 0;

		double[][] myArray = new double[m][n];
		System.out.println("enter the values");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				myArray[i][j] = scan.nextDouble();
			}
		}
		System.out.println("The matrix is : ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(+myArray[i][j] + "\t");
			}
			System.out.println("");
		}

	}
}
