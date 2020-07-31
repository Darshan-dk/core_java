
public class EvenOrOdd {

	public static void main(String[] args) {
		int[] myArray = { 25, 14, 19, 7, 10, 36, 22 };
		int i, j = 0, k = 0;
		int evenArray[] = new int[myArray.length];
		int oddArray[] = new int[myArray.length];
		System.out.println("The given array");
		for (int tempArray : myArray) {
			System.out.print(tempArray + ",");
		}
		System.out.println("");

		for (i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 != 0) {
				oddArray[j] = myArray[i];
				j++;
			}

			else {
				evenArray[k] = myArray[i];
				k++;
			}
		}

		System.out.println("even number in array are");
		for (k = 0; k < evenArray.length; k++) {
			System.out.print(evenArray[k] + "\t");
		}
		System.out.println("");
		System.out.println("Odd number in array are");
		for (j = 0; j < oddArray.length; j++) {
			System.out.print(oddArray[j] + "\t");
		}
	}

}
