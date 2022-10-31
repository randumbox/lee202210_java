package test.main;

import java.nio.channels.MembershipKey;
import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;
import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member객체를 담을수 있는ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아 보세요. 
		List<Member> members=new ArrayList<>();
			
		//2. 3명의 회원정보를 Member 객체에 각각 담아 보세요(Member 객체가 3개 생성되어야 함)
		Member m1 = new Member(1,"2","3");
		Member m2 = new Member(2,"3","4");
		Member m3 = new Member(3,"4","5");
				
		//3. 위에서 생성된 Member객체의 참조값을 member List 객체에 모두 담아보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		//4.members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 반복문을 돌면서 출력해보세요/
		for(Member tmp:members) {
			System.out.println("번호:"+tmp.num+" 이름:"+tmp.name+" 주소:"+tmp.addr);
		}
		
	}
	
}
