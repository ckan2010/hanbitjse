/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :ckan
 * @file   :Num1.java
 * @story  :
 */
public class Num1 {
	/**
	 * 저희반은 학생수가 3명입니다.
	 * 학생의 평균점수는 0~100점 사이입니다.
	 * 3명의 평균점수를 입력하면
	 * 1등 홍길동
	 * 2등 김유신
	 * 3등 김구
	 * 이렇게 나오도록 해주세요.
	 * 단, 학생이름은 스캐너로 입력받습니다.
	 * 홍길동 
	 * 49
	 * 김유신
	 * 78
	 * 김구
	 * 96
	 * =====================
	 * 1등 김구   96점
	 * 2등 김유신 78점
	 * 3등 홍길동 49점
	 * =====================
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name1="",name2="",name3="",first="",second="",therd="",
			   one="",two="",three="";
		int    avg1=0,avg2=2,avg3=0;
		System.out.println("3명 의 학생이름 과 평균점수를 입력 하세요 : ");
	    name1 = scanner.next();
	    avg1  = scanner.nextInt();
	    name2 = scanner.next();
	    avg2  = scanner.nextInt();
	    name3 = scanner.next();
	    avg3  = scanner.nextInt();
	    
	    if (avg1 == avg2 && avg1 == avg3) {
	    	first = "1등";
	    	second = "1등";
	    	therd = "1등";
	    	one = name1;
	    	two = name2;
	    	three = name3;
		} else if(avg1 > avg2 && avg1 > avg3) {
			one = name1;
			if(avg2 == avg3){
				two   = name2;
				three = name3;				
			} else if (avg2 > avg3 ) {
				
			}
		} else {
			
		}
	    System.out.println("===================================");
	}
	
}
