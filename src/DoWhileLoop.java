import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		System.out.println("enter the number you whant");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int i=1,mult;
		do {
			mult=i*num;
			i++;
			System.out.println(num+"*"+i+"="+mult);
		}while(i<=10);
			
	}

}
