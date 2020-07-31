
public class LargestNumberInArray {

	public static void main(String[] args) {
		int[][] myArray = { { 98, 14, 19 }, { 75, 5, 36 }, { 25, 1055, 96 } };
		int large = myArray[0][0], small = myArray[0][0], temp1 = 0, temp2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.println(" ");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				temp1 = myArray[i][j];
				if (large < temp1) {
					large = temp1;
				} else
					continue;
			}

		}
		System.out.println("the largest number in the array is :" + large);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				temp2 = myArray[i][j];
				if (small > temp2) {
					small = temp2;
				} else
					continue;
			}

		}
		System.out.println("the smallest number in the array is :" + small);
	}
}
