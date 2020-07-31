import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int n1=0,n2=1,n3 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		
		while(n>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			n--;
			System.out.print(","+n3);
		}
	
	
	}
	
	
	

}
