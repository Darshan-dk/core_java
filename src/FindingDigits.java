import java.util.Scanner;

public class FindingDigits {

	public static void main(String[] args) {
		int count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		if(n>0) {
		do {
			n=n/10;
			count++;
		}while(n>0);
			
		}
		System.out.println("The numbero digits are: "+count);
	}
	

}
