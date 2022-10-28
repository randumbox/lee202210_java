package test.mypac;

public class MyRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("채널을 올려라");
	}
	
	@Override
	public void down() {
		System.out.println("채널을 내리라");
	}
	
	@Override
	public void polo() {
		System.out.println("폴로보단 나이키");
	}
}
