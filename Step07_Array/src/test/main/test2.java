package test.main;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		int point=1000;
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			// while은 ()동안 무한대로 돈다.
			// point가 0이 되면 종료
				if(point ==0) { 
				break;
				}	
				
			System.out.println("Enter 를 치세요");
			scan.nextLine();
			//point 를 10 감소 시키면서
			//point 10 감소시키면서
			point -= 10;
			
		}
	System.out.println("100회완료");
	}
	
	
}
