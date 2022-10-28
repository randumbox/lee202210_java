package test.main;

import java.util.Scanner;

import test.mypac.Weapon;

public class MainClass05 {
	//필드
	int num=999;
	String name="청명";
	Scanner scan=new Scanner(System.in);
	//필드는 선언만 하면 기본값이 들어 간다.
	int weight; //0
	boolean isRun; //false
	String msg; //null
	Scanner scan2; //null
	//static 영역에 올리고 싶은 필드는 static 예약어를 이용해서 만든다.
	static String greet="안녕";
	
	//class ? extends Weapon - Anonymous Inner class
	static Weapon w1=new Weapon() {
		@Override
		public void attack() {
			System.out.println("광마상태에 돌입합니다.");

		}
	};
				

		
	
	
	
	
	public static void main(String[] args) {
		useWeapon(w1);
		//Anonymous Local Inner class 를 이용해서 Weapon type 의 참조값 얻어내기
		Weapon w2=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("마인");
			
			}
		};
		
		useWeapon(w2);
	
		useWeapon(new Weapon(){
			@Override
			public void attack() {
				System.out.println("24수");
			}
		});
		
		}
		
		public static void useWeapon(Weapon w) {
			w.prepare();
			w.attack();
			
	}
}
