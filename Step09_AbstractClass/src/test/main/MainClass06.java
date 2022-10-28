package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	
	Weapon w1=new Weapon() {
				@Override
		public void attack() {
			System.out.println("상단");
		}
	};
	
	public static void main(String[] args) {
		Weapon w2=new Weapon() {
						@Override
			public void attack() {
				System.out.println("하단");
				
			}
		};
		new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("좌상단");
				
			}
		};
		
		new Weapon() {
			
			@Override
			public void attack() {
			System.out.println("우상단");	
			}
		};
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
