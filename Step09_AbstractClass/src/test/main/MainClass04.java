package test.main;

import test.mypac.Weapon;

public class MainClass04 {

	
	//내부 클래스
	static class yourWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("매화참!");
		}
	}
	
	public static void main(String[] args) {
		Weapon w1=new yourWeapon();
		useWeapon(w1);
		
		// Local Inner Class
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("주화입마");
			}
		}
		Weapon w2=new OurWeapon();
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
