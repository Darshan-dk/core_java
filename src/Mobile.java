
public class Mobile {
	String brand;
	boolean IsSmart;
	double price;
	int ram;

	Mobile() {       //constructor
		brand = "OnePlus";
		IsSmart = true;
		price = 500000;
		ram = 8;

	}

	void call(long phone_numb) {
		System.out.println("Making a phone call" + phone_numb);
	}

	void charge(boolean isCharging) {
		System.out.println("phone is charging" + isCharging);
	}

	void locked(boolean islocked) {
		System.out.println("phone is locked  :" + islocked);
	}

	public static void main(String[] args) {
		Mobile nokia = new Mobile();
		System.out.println("brand is :" + nokia.brand + " IsSmart  : " + nokia.IsSmart + "  price  :  " + nokia.price
				+ "  ram :" + nokia.ram);
	}

}
