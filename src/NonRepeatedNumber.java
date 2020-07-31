
public class NonRepeatedNumber {

	public static void main(String[] args) {
		int[] myArray = { 25, 14, 19, 25, 10, 14, 22 };
		int i, j, count;

		System.out.println("The given array");
		for (int tempArray : myArray) {
			System.out.print(tempArray + "\t");
		}
		System.out.println("");
		System.out.println("The non repeated numbers are :");

		for (i = 0; i < myArray.length; i++) {
			count = 0;
			for (j = 0; j < myArray.length; j++) {
				if (i != j && myArray[i] == myArray[j])
					count++;
			}
			if (count == 0)
				System.out.println(myArray[i]);

		}

	}

}
