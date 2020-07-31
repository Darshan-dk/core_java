
public class IdCard {
	boolean scanable;
	String material;
	int cardNumb;

	public IdCard() {
		System.out.println("no argument constructor");
	}

	public IdCard(boolean inscanable, String inmaterial, int incardNumb) {
		scanable = inscanable;
		material = inmaterial;
		cardNumb = incardNumb;
	}

	public IdCard(boolean inscanable, int incardNumb) {
		scanable = inscanable;
		cardNumb = incardNumb;
	}

	void idnew() {
		System.out.println("this id card is new");
	}

	void old() {
		System.out.println("this id card is old");
	}

	public static void main(String[] args) {
		IdCard college = new IdCard(true, 1245);
		System.out.println("the id card is sacanable :" + college.scanable + "  material type is :" + college.material
				+ " the card number is :" + college.cardNumb);
		college.idnew();
		college.old();

	}

}
