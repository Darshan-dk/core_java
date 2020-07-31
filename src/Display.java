
public class Display {
	
	char charvalue;
	int intvalue;
	
	
	void display(){
		System.out.println("no args");
		
	}
	void display(String strvalue) {
		System.out.println("the string value is"+strvalue);
	}
	void display(String strvalue,int intvalue) {
		System.out.println("the string value is"+strvalue);
		System.out.println("the int value is"+intvalue);
	}
	void display(String strvalue,int intvalue,char charvalue) {
		System.out.println("the string value is"+strvalue);
		System.out.println("the int value is"+intvalue);
		System.out.println("the int char is"+charvalue);
	}
	public static void main(String[] args) {
		Display disp=new Display();
		disp.display("Darshan");
		disp.display("darshan",05);
	}

}
