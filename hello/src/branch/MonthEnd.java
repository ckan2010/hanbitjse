/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :ckan
 * @file   :MonthEnd.java
 * @story  :
 */
public class MonthEnd {

	public static void main(String[] args) {
		/**
		 * 월을 입력하면 말일이 몇일인지 알려주는 
		 * 프로그램.
		 * 단, 2월은 29일로 한정함.
		 * 1~12를 벗어난 숫자를 입력하면
		 * 잘못된 입력값입니다 라고 뜬다.
		 **/
		Scanner scanner = new Scanner(System.in);
		int monthlastday=0;
		String inmonth="";
		System.out.print("월을 입력 하세요 : ");
		switch (scanner.next()) {
		case "1":case"3":case"5":case"7":case "8":case "10":case "12":
			monthlastday = 31;
			break;
		case "4":case "6":case "9":case "11":
			monthlastday = 30;
			break;	
		case "2":
			monthlastday = 29;
			break;
		default:
			System.out.print("월 입력이 잘못되었습니다.");
			return;
		}
		System.out.print("입력 월 : "+inmonth+" 마지막 일 : "+monthlastday);
	}

}
