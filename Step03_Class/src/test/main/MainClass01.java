package test.main;
/*
 *  자동으로 import 하는 방법 2가지
 *  1. 클래스명을 작성하고 ctrl + space
 *  2. ctrl + shift + o
 */
import test.mypac.car;

public class MainClass01 {
	
	public static void main(String[] args) {
		//test.mypac 패키지에 있는 car 클래스로 객체를 생성해서 참조값을 얻어냈지만 사용하지 않고 버리기
		new car();
		//test.mypac 패키지에 있는 car 클래스로 객체를 생성해서 참조값을 얻어내서 car1 이라는 지역변수에 담기
		car1=new car();
		//필드에 값 대입하기
		car1.name="달려또";
		//메소드 호출하기
		car1.drive();
		car1.stop();
		
		car car2=new car();
		car2.name="혼자서";
		car2.drive();
		car2.stop();
	}

}
