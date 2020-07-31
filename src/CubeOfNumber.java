import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		int cube;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		for (int i = 0; i <= n; i++) {
			cube=i*i*i;
			System.out.println("cube of "+i+" is :"+cube);
		}
	}

}
