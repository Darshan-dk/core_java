import java.util.*;

public class MonthNameUsingSwitch {

	public static void main(String[] args) {

		String result = null;
		System.out.println("enter the month number");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch (month) {
		case 1:
			result = " 1=january";
			break;
		case 2:
			result = " 2=February";
			break;
		case 3:
			result = " 3=March";
			break;
		case 4:
			result = " 4=April";
			break;
		case 5:
			result = " 5=May";
			break;
		case 6:
			result = " 6=June";
			break;
		case 7:
			result = " 7=July";
			break;
		case 8:
			result = " 8=August";
			break;
		case 9:
			result = " 9=September";
			break;
		case 10:
			result = " 10=october";
			break;
		case 11:
			result = " 11=november";
			break;
		case 12:
			result = " 12=December";
			break;

		default:
			System.out.println("you entered wrong input");
		}
		System.out.println(result);
	}

}
