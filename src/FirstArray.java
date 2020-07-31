import java.lang.reflect.Array;

public class FirstArray {

	public static void main(String[] args) {
		System.out.println("my first array");
		int myArray[] = new int[10];
		myArray[1] = 343;
		myArray[9] = 687;
		myArray[0] = 88;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
			System.out.println("my second array");
		int[] mySecondArray = { 1, 5, 6, 4, 8, };
		for (int i = 0; i < mySecondArray.length; i++) {
			System.out.print(mySecondArray[i]);

		}

	}

}
