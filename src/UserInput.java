import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of input you want to give");
		int n = scan.nextInt();
		System.out.println("Enter maltiplication factor");
		int m = scan.nextInt();

		int[] myArray = new int[n];
		int mult;
		System.out.println("enter all the elements");

		for (int i = 0; i < n; i++) {
			myArray[i] = scan.nextInt();
			mult = myArray[i] * m;
			System.out.println(myArray[i] + " is multiplied by " + m + "is: " + mult);
		}

	}

}
