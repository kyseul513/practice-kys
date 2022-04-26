package com.javaex.practice;

class Person3 {
	String str1 = "parents class";

	void method1() {System.out.println("parents");}
	void parents() {System.out.println("ppp");}
}

class Student3 extends Person3 {
	String str2 = "child class";

	void method1() {System.out.println("child - overriding");}
	void child() {System.out.println("ccc");}
	void x() {
		method1();	//자식클래스의 method1
		super.method1();	//부모클래스의 method1
	}
}

public class Practice03 {

	public static void main(String[] args) {

		//////// [1] 부모+자식 클래스의 모든 자원 사용 가능
		Student3 s1 = new Student3();
		
		System.out.println(s1.str1);	//부모클래스 str1
		System.out.println(s1.str2);	//자식클래스 str2
		s1.method1();	//overriding되어 자식클래스(Student3)의 method1 출력.
		s1.parents();
		s1.child();		//자식클래스의 child 메소드
		
		//[!] 자식클래스에서 오버라이딩된 부모클래스의 원본메소드를 호출하고 싶다면 -> super사용
		s1.x();
		
		
		//////// [2] 부모의 자원만 사용 가능.
		Person3 s2 = new Student3();
		
		System.out.println(s2.str1);
		//System.out.println(s2.str2);	//자식클래스의 str2 사용 불가
		s2.parents();
		//s2.child();	//자식클래스의 child 사용 불가
		s2.method1();	//!!!! overriding한 것은 자식클래스(Student3)의 메서드로 실행.
		
		//[!] 자식 메서드를 바로 호출하고 싶다면 -> 캐스트 필요
		((Student3)s2).child();
		
		
		
		//////// [3] 부모 클래스의 자원만 사용 가능
		Person3 s3 = new Person3();
		s3.method1();	//부모클래스의 method1
		//s3.child();	//자식클래스의 child 사용 불가
		
		
		
		//////// [4] 상위클래스에서 객체 생성시 타입을 하위클래스로 설정할 수 없음.
		// Student s4 = new Person();
	}

}
