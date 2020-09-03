
public class AmstrongNumber {

	public static void main(String[] args) {
		int temp,a,n=153,c = 0;
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;//taking out last digit//
			c+=a*a*a;
		}
	
	if(c==temp) {System.out.println("the number is amstrong number");}
	else
		System.out.println("this number is not a amstrong number");

		
	}
}

