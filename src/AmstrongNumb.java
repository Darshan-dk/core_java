
public class AmstrongNumb {
	void amstrongNumb(int a) {
		int rem = 0,amsNumb = 0;
		int temp = a;
		do {
			rem=a%10;
			amsNumb+=rem*rem*rem;
			a=a/10;
		}while(a>0);
		
		if(temp==amsNumb)
				System.out.println(temp+" is amstrong number.");
		else
			System.out.println(temp+"is not an amstrong number");
		
	}
	
	public static void main(String[] args) {
		AmstrongNumb num=new AmstrongNumb();
		num.amstrongNumb(1634);
	}

}
