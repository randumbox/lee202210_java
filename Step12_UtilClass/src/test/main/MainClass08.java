package test.main;
/*
 *   while 문을 활용해서 원하는 횟수만큼 반복하기
 *   
 *   - 반복 횟수가 명확히 정해져 있으면 for 문으로 반복문을 도는게 좋다.
 *   - 반복 횟수가 명확히 정해져 있지 않고 반복을 돌아봐야 횟수를 아는 경우 while 문으로 반복문을 도는게 좋다.
 */
public class MainClass08 {
	public static void main(String[] args) {
		int count=0;
		while(true) {
			System.out.println("안녕!");
			count++;
			if(count==5) {
				break;
			}
		}
		System.out.println("---F---");
		count=0;
		
		while(count<5) {
			System.out.println("ㅎㅇ");
			count++;
		}
	}
}
