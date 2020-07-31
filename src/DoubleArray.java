
public class DoubleArray {

	public static void main(String[] args) {
		Double[] dArray= {10.00,34.09,676.98};
		double sum=0;
		for(double tempdbl:dArray) {
			
		
			sum+=tempdbl;
			System.out.println("the array contains: "+tempdbl);
		}System.out.println("the sum of array: "+sum);
	}

}
