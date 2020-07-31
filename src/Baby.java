
public class Baby {

	String color, religion, name;
	double weight;

	Baby() {
		System.out.println("Object baby is created");

	}

	void laugh() {
		System.out.println("The baby is laughing");
	}

	void eat() {
		System.out.println("The baby is eating");
	}

	void cry() {
		System.out.println("The baby is crying");
	}

	public static void main(String[] args) {

		Baby elderbaby = new Baby();
		elderbaby.color = "black";
		elderbaby.religion = "Hindu";
		elderbaby.name = "Darshan";
		elderbaby.weight = 4.5;

		System.out.println("color of a baby is :" + elderbaby.color);
		System.out.println("religion of the baby is :" + elderbaby.religion);
		System.out.println("Name of the bay is :" + elderbaby.name);
		System.out.println("Weight of the baby is : " + elderbaby.weight);

		elderbaby.laugh();
		elderbaby.eat();
		elderbaby.cry();
		System.out.println("----------*-----------*----------*");

		Baby youngerbaby = new Baby();
		youngerbaby.color = "white";
		youngerbaby.religion = "chritian";
		youngerbaby.name = "Greg";
		youngerbaby.weight = 5.5;

		System.out.println("color of a baby is :" + youngerbaby.color);
		System.out.println("religion of the baby is :" + youngerbaby.religion);
		System.out.println("Name of the bay is :" + youngerbaby.name);
		System.out.println("Weight of the baby is : " + youngerbaby.weight);

		youngerbaby.laugh();
		youngerbaby.eat();
		youngerbaby.cry();
		System.out.println("----------*-----------*----------*");

	}

}
