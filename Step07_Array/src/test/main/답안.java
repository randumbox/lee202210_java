package test.main;

import java.util.Random;

public class 답안 {
   public static void main(String[] args) {
      String[] items = {"cherry", "apple","banana","melon","7"};
      
      Random ran = new Random();
      
    
      /* 2. run했을 때 
       *    5개의 문자열 중에서 3개가 한 줄에 한 번에 랜덤하게 출력되게 해 보세요.
       */

       for(int i=0; i<3; i++) {
    	   int ranNum = ran.nextInt(5);
    	   System.out.print(items[ranNum]);
    	   if (i<2) {
    	   System.out.print("|");
    	   }
    }
       



   }
}