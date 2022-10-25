package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		
		/*
		 *  1. MacBook 객체를 생성해서 참조값을 mac1 이라는 지역변수에 담아 보세요.
		 *  단, MacBook 클래스를 절대 수정하지 마세요
		 */
		
		//2. mac1 지역변수에 들어 있는 참조값을 이용해서 .doGame() 이라는 메소드를 호출해 보세요.
		
		//MacBook 클래스의 생성자의 인자로 전달할 값이 지역변수에 준비가 되어 있다고 가정하면
		Cpu m1= new Cpu();
		Memory m2= new Memory();
		HardDisk m3 = new HardDisk();
		
		MacBook m4 = new MacBook(m1, m2, m3);
		// = MacBook mac1=new Macbook(new Cpu(), new Memory(), new HardDisk());
		m4.doGame();
		
	}
}