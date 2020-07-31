
public class Bottle {
String color;
String material;
int liters;

Bottle(){
	System.out.println("Bottel is created");
	
}
	void pourWater() {
		System.out.println("pouring the water");
	}

	void openCap() {
		System.out.println("opening the cap");
	}

	void closeCap() {
		System.out.println("closing the capr");
	}
public static void main(String[] args) {
	Bottle prestigeBottle=new Bottle();  //instance object
	prestigeBottle.color="black";
	prestigeBottle.material="cupper";
	prestigeBottle.liters=1;
	
	System.out.println("cocor"+prestigeBottle.color);
	System.out.println("material"+prestigeBottle.material);
	System.out.println("lites"+prestigeBottle.liters);
	
	prestigeBottle.pourWater();
	prestigeBottle.openCap();
	prestigeBottle.closeCap();
}




}
