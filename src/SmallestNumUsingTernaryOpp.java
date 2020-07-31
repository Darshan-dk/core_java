
public class SmallestNumUsingTernaryOpp {

	public static void main(String[] args) {
		int a=154,b=23,c=56;
		System.out.println("The given input values are a:"+a+ " b:" +b+" c:"+c );
			
		
		String result=(a<b)?
					 ( (a<c)?"a is smallest":"c is smallest")
					 : ((b<c)? "b is smallest":"c is smallest");
					  System.out.println(result);
	}

}
