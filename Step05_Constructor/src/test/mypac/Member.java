package test.mypac;

public class Member{
	public int num;
	public String name;
	public String addr;

	//생성자를 하나라도 정의하면 기본 생성자는 없다고 간주 되기 때문에
	//기본 생성자도 피요하면 명시적으로 정의 해야 한다.
	
	public Member() {}
	
	//3개의 인자를 전달받을 준비가 된 생성자
	public Member(int num, String name, String addr) {
		//생성자에도 매개 변수를 선언할 수 있다.)
		//생성자의 인자로 전달받은 값을 필드에 저장하기
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	
	public void showInfo() {
		System.out.println("번호:"+this.num+", 이름:"+this.name+", 주소"+this.addr);
	}


	
}