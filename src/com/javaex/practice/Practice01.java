package com.javaex.practice;

class Person {

	private String name;
	private int age;
	private int height;
	private int weight;

	Person() {
	}

	Person(String name, int age, int height, int weight) {
		this.name = name;		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // this: 전달된 p1
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void move() {
		System.out.println("이동중");
	}

}

class Villain extends Person {

	private String unique_key;
	private int weapon;
	private double power;

	Villain() {
	}

	public Villain(String name, int age, int height, int weight, String unique_key, int weapon, double power) {
		super(name, age, height, weight);
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
	}

	public String getUnique_key() {
		return unique_key;
	}

	public void setUnique_key(String unique_key) {
		this.unique_key = unique_key;
	}

	public int getWeapon() {
		return weapon;
	}

	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void printPerson() {
		System.out.println("이름:" + getName());
		System.out.println("나이:" + getAge());
	}
}

class Hero extends Person {
}

public class Practice01 {

	public static void main(String[] args) {

		Villain v1 = new Villain("aa", 20, 180, 80, "15001231", 1, 99.5);
		v1.printPerson();
	}
}
