import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int array = scan.nextInt();
		scan.close();
	}

}
