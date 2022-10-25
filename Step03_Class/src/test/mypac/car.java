package test.mypac;
/*
 *  class 의 역할
 *  
 *  1. 객체의 설계도 역할
 *  
 *  2. data type 역할
 *  
 *  3. static 필드와 메소드를 포함하는 역할
 */
public class car {
	//저장소(field)
	public String name;
	
	//달리는 기능(method)
	public void drive() {
		System.out.println(this.name+"달려");
	}
	// 이 클래스로 객체가 생성이 된다면 바로 그 객체의 참조값을 가리키는 예약어가 this 이다.
	
	
	//멈추는 기능(method)
	public void stop() {
		System.out.println("너무먼길을");
	}
}
