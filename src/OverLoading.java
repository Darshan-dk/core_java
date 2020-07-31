
public class OverLoading {
	
	void OverLoading (int a,int b) {
		int sum=a+b;
		System.out.println("The sum of "+a+" and "+b+" is :"+sum);
	}
	void OverLoading (double a,double b) {
		double sum=a+b;
		System.out.println("The sum of "+a+" and "+b+" is :"+sum);
	}
	void OverLoading (float a,float b) {
		float sum=a+b;
		System.out.println("The sum of "+a+" and "+b+" is :"+sum);
	}
	void OverLoading (long a,long b) {
		long sum=a+b;
		System.out.println("The sum of "+a+" and "+b+" is :"+sum);
	}
	void OverLoading (byte a,byte b) {
		int sum=a+b;
		System.out.println("The sum of "+a+" and "+b+" is :"+sum);
	}
	

	public static void main(String[] args) {
		OverLoading num=new OverLoading();
		num.OverLoading(2.5,2.6556566666);
		
		
	}

}
