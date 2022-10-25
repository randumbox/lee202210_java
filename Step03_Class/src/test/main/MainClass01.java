package test.main;
import test.mypac.Car;
/*
 *  자동으로 import 하는 방법 2가지
 *  1. 클래스명을 작성하고 ctrl + space
 *  2. ctrl + shift + o
 */


public class MainClass01 {
	
	public static void main(String[] args) {
		//test.mypac 패키지에 있는 car 클래스로 객체를 생성해서 참조값을 얻어냈지만 사용하지 않고 버리기
		new Car();
		//test.mypac 패키지에 있는 car 클래스로 객체를 생성해서 참조값을 얻어내서 car1 이라는 지역변수에 담기
		Car m1 = new Car();
		//필드에 값 대입하기
		m1.name = "달려";
		//메소드 호출하기
		m1.drive();
		m1.stop();
	
		Car car2=new Car();
		car2.name="혼자서";
		car2.drive();
		car2.stop();
	}

}
