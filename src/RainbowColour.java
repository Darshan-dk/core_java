import java.util.Scanner;

public class RainbowColour {

	public static void main(String[] args) {
	
				String result = "";
				System.out.println("enter the colour"); 
				Scanner sc = new Scanner(System.in);
				String colour = sc.nextLine();
	  
	//(red, orange, yellow, green, blue, indigo, violet
				switch (colour) {
				case "red":
					result = " red-this is a rainbow colour";
					break;
				case "orange":
					result = " orange-this is a rainbow colour";
					break;
				case "yellow":
					result = " yellow-this is a rainbow colour";
					break;
				case "green":
					result = " green-this is a rainbow colour";
					break;
				case "blue":
					result = " blue-this is a rainbow colour";
					break;
				case "indigo":
					result = " indigo-this is a rainbow colour";
					break;
				case "violet":
					result = " violet-this is a rainbow colour";
					break;
				
				default:
					System.out.println("The colour you entered is not in rainbow");
					break;
				}
				System.out.println(result);
		


	}

}
