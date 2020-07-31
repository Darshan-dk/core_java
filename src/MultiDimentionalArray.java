
public class MultiDimentionalArray {

	public static void main(String[] args) {
		int[][] intArray = new int[2][2];// index method
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[1][0] = 3;
		intArray[1][1] = 4;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println("");

		}
		System.out.println("by the method of literal");
		int[][] literalArray = { { 12, 13, 14 }, { 14, 15, 16 }, { 17, 18, 19 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(literalArray[i][j] + "\t");
			}
			System.out.println("");

		}
	}

}
