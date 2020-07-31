
public class Bag {
	int numberOfZip;
	String material;
	String brand;

	public Bag() {
		System.out.println("no argument constructor");
	}

	public Bag(int innumberOfZip, String inmaterial, String inbrand) {
		numberOfZip = innumberOfZip;
		material = inmaterial;
		brand = inbrand;
	}

	public Bag(int innumberOfZip, String inmaterial) {
		numberOfZip = innumberOfZip;
		material = inmaterial;
	}

	void open() {
		System.out.println("the bag is open");
	}

	void close() {
		System.out.println("the bag is close");
	}

	public static void main(String[] args) {
		Bag schoolBag = new Bag(6, "plastic");
		System.out.println("the bag has " + schoolBag.numberOfZip + " zips " + " material type is " + schoolBag.material
				+ " the brand of bag is " + schoolBag.brand);
		schoolBag.open();
		schoolBag.close();

	}

}
