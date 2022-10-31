package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		Joinner j1= new Joinner() {
			
			@Override
			public String join(String one, String two) {
				
				return one+two;
			}
		};
		
		String result1=j1.join("안녕","하세요");
	}
}
