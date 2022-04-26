package com.javaex.practice;

class Person3 {
	String str1 = "parents class";

	void method1() {
		System.out.println("parents");
	}

	void parents() {
		System.out.println("ppp");
	}
}

class Student3 extends Person3 {
	String str2 = "child class";

	void method1() {
		System.out.println("child - overriding");
	}

	void child() {
		System.out.println("ccc");
	}
}

public class Practice03 {

	public static void main(String[] args) {

		// [1] 부모+자식 클래스의 모든 자원 사용 가능
		Student3 s1 = new Student3();
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();	//overriding되어 Student3 클래스의 method1 출력.
		s1.parents();
		s1.child();		//자식클래스의 child 메소드 사용

		// [2] 부모의 자원만 사용 가능.
		Person3 s2 = new Student3();
		

		// [3] 부모 클래스의 자원만 사용 가능
		Person3 s3 = new Person3();

		// [4] 상위클래스에서 객체 새성시 타입을 하위클래스로 설정할 수 없음.
		// Student s4 = new Person();
	}

}
