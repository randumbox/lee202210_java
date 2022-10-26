package test.main;
import java.util.Random;
public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  0~9 사이의 랜덤한 정수를 얻어내서 콘솔창에 출력하고 싶다...
		 *  
		 *  hint ) Randdom 클래스를 import 해서 사용해 보세요.
		 */

		//Random 객체를 생성해서
		Random m1 = new Random();
		
		//nextInt() 메소드를호출해서 정수 하나를 리턴 받아서 콘솔창에 출력해보기
		System.out.println(m1.nextInt(10));
		
		//1~45 사이의 랜덤한 정수 하나를 얻어내서 ranNum2 라는 지역 변수에 담아 보세요.
		
		//true or false 중에 랜덤한 boolean 값을 얻어내서 isRun 이라는 지역 변수에 담아 보세요.
		
		int ranNum2 = m1.nextInt(1,46);
		boolean inRun = m1.nextBoolean();
	}
}
