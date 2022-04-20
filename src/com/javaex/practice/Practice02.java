package com.javaex.practice;

class Person1 {

	String name;
	int age;
	int weight;

	Person1() {
	}

	Person1(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	void wash() {
		System.out.println("wash");
	}

	void study() {
		System.out.println("study");
	}

	void paly() {
		System.out.println("play");

	}

}



interface Allowance {

	abstract void in(int price, String name);
	abstract void out(int price, String name);

}

interface Train {
	abstract void train(int training_pay, String name);
}



class Student extends Person1 implements Allowance, Train {
	Student() {
	}

	Student(String name, int age, int weight) {
		super(name, age, weight);
	}

	public void in(int price, String name) {
		System.out.printf("%s에게서 %d원 용돈을 받았습니다.", name, price);

	}

	public void out(int price, String name) {
		System.out.printf("%d원 금액을 지출했습니다.[지출용도 -> %s]", price, name);
	}

	public void train(int training_pay, String name) {
		System.out.printf("[%s-> %d원 입금완료]", name, training_pay);
	}
}

public class Practice02 {
	public static void main(String[] args) {
		Student s1 = new Student("aaa", 20, 85);
	}
}
