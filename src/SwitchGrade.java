
public class SwitchGrade {

	public static void main(String[] args) {
		char grade='A';
		
		switch (grade) {
		case 'A':
		System.out.println("your mark is in bw 85 to 100");
		break;
		case 'b':
			System.out.println("your mark is in bw 60 to 84");
			break;
		case 'c':
			System.out.println("your mark is in bw 35 to 59");
			break;
		default:
			System.out.println("you did not pass.");
			break;
		}

	}

}
