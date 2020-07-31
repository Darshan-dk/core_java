package com.xworkz.corejava.publicmodifier;

public class Dog
 {
private String breed;
protected String color;
int age;
public boolean ismale;

private Dog() {
	System.out.println("the dog is created");
}
Dog(String inbreed){
	System.out.println("constructor with one argument");
}
public Dog(String inbreed,int age) {
	System.out.println(("constructor with two parameter"));
	
}
void barking() {
	System.out.println("the dog is barking");
}
private void eating() {
	System.out.println("the dog is eating");
}
public void running() {
	System.out.println("the dog s running");
}
	public static void main(String[] args) {
		Dog dog2=new Dog();
		dog2.breed="pug";
		dog2.age=4;
		dog2.eating();
		dog2.barking();
		
	}

}
