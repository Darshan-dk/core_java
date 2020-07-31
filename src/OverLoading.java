
public class OverLoading {
	int a;
	int b;
	int c;
	
	
	OverLoading(int inputa,int inputb,int inputc){
		a=inputa;
		b=inputb;
		c=inputc;
		
	}
	void add(int a, int b) {
		int sum=a+b;
		System.out.println("the sum is"+sum);
	}
	void add(int a, int b,int c) {
		int sum=a+b+c;
		System.out.println("the sum is"+sum);
	}
	
	
	public static void main(String[] args) {
		OverLoading addition=new OverLoading(10,20,30);
		
		addition.add(addition.a,addition.b);
		addition.add(addition.a,addition.b,addition.c);
		addition.add(10,15);
		

	}

}
