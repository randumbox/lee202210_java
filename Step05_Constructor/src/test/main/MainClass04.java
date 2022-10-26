package test.main;
import java.util.Random;
public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  0~9 사이의 랜덤한 정수를 얻어내서 콘솔창에 출력하고 싶다...
		 *  
		 *  hint ) Randdom 클래스를 import 해서 사용해 보세요.
		 */

		Random m1 = new Random();
		System.out.println(m1.nextInt(10));
		
	}
}
