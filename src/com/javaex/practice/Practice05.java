package com.javaex.practice;

class Sample {
	// Field
	private Object obj;

	// Constructor
	Sample(Object x) {
		this.obj = x;
	}

	// Method
	public Object getObj() {
		return obj;
	}

	void printInfo() {
		System.out.println(obj.getClass().getName()); // 객체가 속하는 클래스의 정보를 출력하는 메서드
	}
}

public class Practice05 {

	public static void main(String[] args) {

		// 객체생성 -> 문자열
		Sample s1 = new Sample("안녕하세요");
		System.out.println(s1.getObj());
		s1.printInfo();

		// 객체생성 -> 숫자
		Sample s2 = new Sample(100);
		System.out.println(s2.getObj());
		// System.out.println(s2);
		s2.printInfo();

		// 객체생성 -> Object
		Sample s3 = new Sample(new Object());
		System.out.println(s3.getObj());
		s3.printInfo();

		// 위와같이 사용시 단점
		//String str = s1.getObj(); // 리턴시 반환 타입이 Object여서 String으로 받을 수 없음.
		String str = (String)s1.getObj();	//이와 같이 형변환 필요
		
		//아래와 같이 Object으로 받을 경우.
		Object num = s2.getObj();
		//System.out.println(num + 100);	//num은 object이기 때문에 100과 연산이 안됨.
		System.out.println((int)num + 100); //이와 같이 int로 형변환 필요.
	}
}
