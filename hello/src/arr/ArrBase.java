/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :ckan
 * @file   :ArrBase.java
 * @story  :배열(array)의 기초
 */
public class ArrBase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[]name = new String[3];
		String[]grade = new String[3];
		int[]avg = new int[3];
		int[]result = new int[3];
		int i=0;
		
	    for (; i < avg.length; i++) {
	    	System.out.println("이름,점수 입력");
	    	name[i] = scanner.next();
		    avg[i]  = scanner.nextInt();
		}
	    if(avg[0] > avg[1] && avg[0] > avg[2]) {
			grade[0] = name[0];
			result[0] = avg[0];
			if (avg[1] > avg[2] ) {
				grade[1]   = name[1];
				result[1] = avg[1];
				grade[2] = name[2];
				result[2] = avg[2];
			} else{
				grade[1]   = name[2];
				result[1] = avg[2];
				grade[2] = name[1];
				result[2] = avg[1];
			}
		} else if(avg[1] > avg[0] && avg[1] > avg[2]) {
				grade[0] = name[1];
				result[0] = avg[1];
				if (avg[0] > avg[2] ) {
					grade[1]   = name[0];
					result[1] = avg[0];
					grade[2] = name[2];
					result[2] = avg[2];
				} else{
					grade[1]   = name[2];
					result[1] = avg[2];
					grade[2] = name[0];
					result[2] = avg[0];
				}
			} else if(avg[2] > avg[0] && avg[2] > avg[1]) {
					grade[0] = name[2];
					result[0] = avg[2];
					if (avg[0] > avg[1] ) {
						grade[1]   = name[0];
						result[1] = avg[0];
						grade[2] = name[1];
						result[2] = avg[1];
					} else{
						grade[1]   = name[1];
						result[1] = avg[1];
						grade[2] = name[0];
						result[2] = avg[0];
					}
		} else {
			System.out.println("평균점수로 순위를 할수 없습니다.");
	    	return;
		}
	    System.out.println("===================================");
	    System.out.println("1등 "+grade[0]+"  "+result[0]+" 점");
	    System.out.println("2등 "+grade[1]+"  "+result[1]+" 점");
	    System.out.println("3등 "+grade[2]+"  "+result[2]+" 점");
	    System.out.println("===================================");
	}

}
