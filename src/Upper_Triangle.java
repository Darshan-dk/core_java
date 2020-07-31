
public class Upper_Triangle {

	public static void main(String[] args) {
		int[][] myArray = {{98,14,19,84},{75,5,36,56},{25,45,96,61},{10,88,43,79}};
		
		for( int i=0;i<myArray.length;i++) {
			for (int j =  0; j < myArray[i].length; j++) {
			   if(myArray[i].length-i>j)
				   
                   
                    System.out.print(myArray[i][j] + " ");    
                }    System.out.println(); 
		}    
}}
