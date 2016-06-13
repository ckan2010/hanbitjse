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
public class Num1_2 {
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
		String name="",name1="",name2="",name3="",
			   one="",two="",three="";
		int    avg=0,avg1=0,avg2=2,avg3=0,result1=0,result2=0,result3=0,i=0;
		
		for (i = 1; i <= 3; i++) {
			System.out.println("이름,점수 입력");
			name = scanner.next();
		    avg  = scanner.nextInt();
		}
	    name1 = scanner.next();
	    avg1  = scanner.nextInt();
	    if (avg1>100 || avg1<0){
	    	System.out.println("학생1 의 평균점수는 0~100점 사이입니다.");
	    	return;
	    }
	    name2 = scanner.next();
	    avg2  = scanner.nextInt();
	    if (avg2>100 || avg2<0){
	    	System.out.println("학생2 의 평균점수는 0~100점 사이입니다.");
	    	return;
	    }
	    name3 = scanner.next();
	    avg3  = scanner.nextInt();
	    if (avg3>100 || avg3<0){
	    	System.out.println("학생3 의 평균점수는 0~100점 사이입니다.");
	    	return;
	    }
	    if(avg1 > avg2 && avg1 > avg3) {
			one = name1;
			result1 = avg1;
			if (avg2 > avg3 ) {
				two   = name2;
				result2 = avg2;
				three = name3;
				result3 = avg3;
			} else{
				two   = name3;
				result2 = avg3;
				three = name2;
				result3 = avg2;
			}
		} else if(avg2 > avg1 && avg2 > avg3) {
				one = name2;
				result1 = avg2;
				if (avg1 > avg3 ) {
					two   = name1;
					result2 = avg1;
					three = name3;
					result3 = avg3;
				} else{
					two   = name3;
					result2 = avg3;
					three = name1;
					result3 = avg1;
				}
			} else if(avg3 > avg1 && avg3 > avg2) {
					one = name3;
					result1 = avg3;
					if (avg1 > avg2 ) {
						two   = name1;
						result2 = avg1;
						three = name2;
						result3 = avg2;
					} else{
						two   = name2;
						result2 = avg2;
						three = name1;
						result3 = avg1;
					}
		} else {
			System.out.println("평균점수로 순위를 할수 없습니다.");
	    	return;
		}
	    System.out.println("===================================");
	    System.out.println("1등 "+one+"  "+result1+" 점");
	    System.out.println("2등 "+two+"  "+result2+" 점");
	    System.out.println("3등 "+three+"  "+result3+" 점");
	    System.out.println("===================================");
	    
	}
	
}
