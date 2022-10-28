package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	// annoymous inner class 를 이용해서 interface type 의 참조값을 얻어내기
	// static 메소드 안에서 사용해야 되기 때문에 static 필드로 만들어 준다.
	static Remocon r1=new Remocon() {
		
		@Override
		public void up() {
			System.out.println("에어컨을 킨다");
			
		}
		
		@Override
		public void polo() {
			System.out.println("히터를 킨다");
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void down() {
			System.out.println("모두 끈다");
			// TODO Auto-generated method stub
			
		}
	};
	
	public static void main(String[] args) {
		useRemocon(r1);
		
		Remocon r2=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("lv.1");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void polo() {
				System.out.println("lv.2");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void down() {
				System.out.println("lv.3");
				// TODO Auto-generated method stub
				
			}
		};
		useRemocon(r2);
		
		useRemocon(new Remocon() {
			//메소드 호출하면서 리모컨타입을 즉석에서 얻어내서 전달하기
			@Override
			public void up() {
				System.out.println("바닥 개방");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void polo() {
				System.out.println("창문 개방");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void down() {
				System.out.println("천장 개방");
				// TODO Auto-generated method stub
				
			
		}
			});
	}
		
	
	public static void useRemocon(Remocon r) {
		r.up();		
		r.polo();
		r.down();
	}
	
}
