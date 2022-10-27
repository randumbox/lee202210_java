package test.main;

import java.util.Random;

public class 답안2 {
 public static void main(String[] args) {
     /* 3. 3개 모두 같을 때 2점
      *    2개만 같을 때 1점
      *    같지 않을 때 0점
      */
	 
	 Random ran = new Random();

  	   
	 //for문 안에서 얻어낸 랜덤한 숫자 3개를 저장할 배열 객체 생성
	 int [] nums=new int[3];
	 
	 for(int i=0; i<3; i++) {
		 int ranNum=ran.nextInt(5);
		 System.out.print(ranNum);
		 if(i<2) {
			 System.out.print("|");
		 }
		 //배열에 얻어낸 랜덤한 숫자를 저장하기
		 nums[i]=ranNum;
	 }
	 //개행
	 
	 // nums 배열에 저장된 3개의 숫자가 모두 같은지 여부를 boolean type 으로 얻어내기
	 boolean isEqual = nums[0] == nums[1] && nums[1] == nums[2];
	 if(isEqual) {
		 System.out.println("10점 입니다.");
	 }else {
			 System.out.println("0 점 입니다.");
		 }
	 }
}

