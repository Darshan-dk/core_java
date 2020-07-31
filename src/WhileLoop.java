import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int numb = scan.nextInt();   

		while (i <= 10) {
			int mult;
			mult = i * numb;
			System.out.println(numb + "*" + i + "=" + mult);
			i++;
		}
	}

}
