package test.main;

import test.utill.myUtil;

public class MainClass08 {
	public static void main(String[] args) {
		//상속받은 BaseUtill 클래스에 정의된 static 메소드도 모두 사용가능
		myUtil .send();
		myUtil.clear();
		myUtil.light();
	}
}
