package test.main;


import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		

		/*MyObject 객체를 하나만 생성해서 그 객체가 가지고 있는 -> 테두리
		 * walk(), getNumber(), getGreeging() 메소드를 차례로 호출해 보세요. -> 테두리안 동그라미
		 * 단, 메소드가 어떤 data 를 리턴하면 해당 데이터를 지역변수에 담으세요. -> 지역변수명은 내 맘대로.
		 */
	
		
		MyObject mo = new MyObject();
		
		mo.walk();
		int num = mo.getNumber();
		String tex = mo.getGreeting();
		Car car=mo.getcar();
		
		// setNum(), setName(), useCar()

		mo.setNum(5);
		mo.setName("검");
		mo.useCar(new Car());
				//메소드 호출하면서 인자로 전달할 데이터를 즉석에서 만들어서 전달하기
		
		
		//메소드 호출하면서 인자로 전달할 값이 지역변수에 이미 존재하는 경우라고 가정하자
		int a=999;
		String b="누구게";
		Car c1=new Car();
		
		//전달할 값이 들어 있는 변수명으로 전달할 수도 있다.
		mo.setNum(a);
		mo.setName(b);
		mo.useCar(c1);
		
		// doSomething() 메소드를 호출해보세요.
		
		mo.doSomething(5,"오", c1);
	}
}