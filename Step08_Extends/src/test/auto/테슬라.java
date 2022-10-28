package test.auto;

public class 테슬라 extends Car {
	
	public 테슬라 (Engine engine) {
		super(engine);
	}
	
	public void open () {
		System.out.println("문을 엽니다.");
	}
	
	public void close () {
		System.out.println("문을 닫습니다");
	}
	
	@Override
	public void drive() {
		System.out.println("엔진을 태웁니다.");
	}
	
}
