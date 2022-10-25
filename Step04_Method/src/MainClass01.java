package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		/*MyObject 객체를 하나만 생성해서 그 객체가 가지고 있는 -> 테두리
		 * walk(), getNumber(), getGreeging() 메소드를 차례로 호출해 보세요. -> 테두리안 동그라미
		 * 단, 메소드가 어떤 data 를 리턴하면 해당 데이터를 지역변수에 담으세요. -> 지역변수명은 내 맘대로.
		 */
		
		
		MyObject m0 = new MyObject();
		
		m0.walk();
		int num=m0.getNumber();
		String tex= m0.getGreeting();
		
	}
}
