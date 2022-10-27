package test.main;

import java.util.Random;

public class test {
	public static void main(String[] args) {
		String[] items= {"체리", "사과", "바나나", "멜론" ,"7"}; 
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();
		//0~4 사이의 랜덤한 숫자를 하나 얻어내서
		int ranNum=ran.nextInt(5);
		//배열의 인덱스 활용해서 문자열 출력하기
			System.out.println(items[ranNum]);
	}
}
