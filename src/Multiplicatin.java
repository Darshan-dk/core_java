import java.util.*;
public class Multiplicatin {

	public static void main(String[] args) {
	int i,mult;
	System.out.println("enter the number");
	Scanner scan=new Scanner(System.in);
     int numb=scan.nextInt();
     
     
     
     for(i=1;i<=10;i++) {
    	 mult=i*numb;
     System.out.println(numb+"*"+i+"="+ mult);
	 }
	}

}
