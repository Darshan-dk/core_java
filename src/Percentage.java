                           import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter how many subject you have");
		int n = scan.nextInt();
		int i;

		double[] myMarks = new double[n];
		System.out.println("enter your marks");
		for (i = 0; i < n; i++) {
			myMarks[i] = scan.nextDouble();
			
		}
		
		System.out.print("The marks which you are entered are :");
		for (double tempint : myMarks) {
			System.out.print(tempint + "\t");

		}
		System.out.println("");
		double total = 0;
		for (i = 0; i < n; i++) {
			total += myMarks[i];
		}
		double pecentage = (total / n);
		System.out.println("yor mark is :" + pecentage + "%");
	}

}
