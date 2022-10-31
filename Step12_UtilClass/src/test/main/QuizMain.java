package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		//sample 데이터
		Map<String, String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		Scanner scan=new Scanner(System.in);
			System.out.println("검색할 단어를 입력하세요:");
			
		String line = scan.nextLine();
		
		if (dic.containsKey(line)) {
			//입력한 문자값(word)을 dic의 object key 값과 대조후 true 일경우에			
		System.out.println("의 뜻은 "+dic.get(line)+"입니다.");
		// dic의 값에서 get 명령어로 가져온다.  
			
		}else {
			System.out.println("는 목록에 없습니다.");
			//입력한 문자값(word)을 dic의 object key 값과 대조후 false 일경우에 출력
			//key값만 입력하면 return 되기때문에 혼동x
				}
	}
	
	

		
		
		
		/*
		 * if
		 * else 는 목록에 없습니다.
		 * 
		 *   검색할 단어를 입력하세요 : house
		 *   house 의 뜻은 집입니다.    a+"의 뜻은" +b+"입니다."
		 *   
		 *   검색할 단어를 입력하세요 : grua
		 *   gura 는 목록에 없습니다.
		 */
	}

