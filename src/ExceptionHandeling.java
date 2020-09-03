
public class ExceptionHandeling {
	public static void main(String[] args) {
		int a=20, b=5;
		try {
			int sum=a/b;
			System.out.println(sum);
			String name=null;
			int iname=name.length();
			System.out.println(iname);
		}catch(ArithmeticException e) {
			System.out.println("exception");
			
		}catch(NullPointerException e) {
			System.out.println("ecxeption null");
		}
	
		
	}

}
