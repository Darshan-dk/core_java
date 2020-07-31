import java.util.Scanner;

public class Transpose_Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number of rows and column for sqare matrix");
		int n = scan.nextInt();
		int m = n;
		int[][] array = new int[n][m];
		int transpose_Matrix[][] = new int[n][m];
		System.out.println("enter the values to the array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				transpose_Matrix[j][i] = array[i][j];
			}
		}
		System.out.println("the matrix which you entered");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");

		System.out.println("the matrix after transpose");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(transpose_Matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
