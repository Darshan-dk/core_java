package com.java.collection.arraylist;

public class Tree implements Comparable<Tree> {

	private int age;
	private int height;
	private String name;

	public Tree(int age, int height, String name) {
		super();
		this.age = age;
		this.height = height;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tree [age=" + age + ", height=" + height + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Tree o) {

		return this.age - o.age;
	}

}
