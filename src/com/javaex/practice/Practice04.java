package com.javaex.practice;

abstract class Car {
	abstract void run();
}

class Ambulance extends Car {
	void run() {
		System.out.println("앰뷸런스");
	}
}

class truck extends Car {
	void run() {
		System.out.println("트럭");
	}
}

class SportsCar extends Car {
	void run() {
		System.out.println("스포츠카");
	}
}

public class Practice04 {

	public static void main(String[] args) {

		// [1] 객체길이가 3인 Car 객체 배열 선언
		/*
		Car[] cars = new Car[3];
		System.out.println(cars[0]);	//->각 배열에는 아직 null값만 존재.
		
		cars = new Car[] {new Ambulance(), new truck(), new SportsCar()}; //Car 타입의 배열선언을 해두고 각 배열을 Ambulance, truck, SportsCar로 초기화
		System.out.println(cars[0]); //주소값 출력
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		*/
		
		
		//[2] 1번 방법 말고-> 자식클래스로 객체 생성 -> 타입은 부도타입으로 -> 이렇게 생성된 객체들로 바로 배열초기화 -> 다형성 덕분.
		Car[] cars = {new Ambulance(), new truck(), new SportsCar()};
		
		
		//[3] 반복문 돌면서 각 객체의 run() 메서드 호출
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);	//각 객체가 생성된 메모리 공간의 주소값을 출력.
			cars[i].run();
		}
		
		
		//[4] 향상된 for문
		System.out.println("------------------------------");
		for(Car obj: cars) {
			System.out.println(obj);	//각 객체가 생성된 메모리 공간의 주소값을 출력.
			obj.run();
		}
	}

}
