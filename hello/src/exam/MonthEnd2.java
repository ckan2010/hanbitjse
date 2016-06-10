/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :ckan
 * @file   :MonthEnd.java
 * @story  :
 */
public class MonthEnd2 {

	public static void main(String[] args) {
		/**
		 * 개발자님 년,월을 입력하면 말일이 몇일인지 알려주는 
		 * 프로그램을 만들어 주세요.
		 * 단, 윤년 2월은 29일 이고, 나머지 해는 28일로 마감입니다.
		 * 1~12를 벗어난 숫자를 입력하면
		 * 잘못된 입력값입니다 라고 뜬다.
		 **/
		/***
		 * 윤년의 조건
		 * 연도를 4로 나눈값이 0이라면 윤년일 수 있다.
		 * 그러나 해당 연수가 100으로 나눠 떨어지면 평년이다.
		 * 2000년은 4로 나눈값이 0이라서 윤년의 조건은 되는데
		 * 평년이라 해도 다시 400으로 나눠떨어지는 년도는 윤년이다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int monthlastday=0,year=0,month=0;
		System.out.println("년을 입력 하세요(예)2016 : ");
		year = scanner.nextInt();
		System.out.println("월 입력 하세요(예)2 : ");
		month = scanner.nextInt();
		switch (month) {
		case 1: case 3:case 5:case 7:case 8:case 10:case 12:
			monthlastday = 31;
			break;
		case 4:case 6:case 9:case 11:
			monthlastday = 30;
			break;	
		case 2:
			monthlastday = year%4 == 0 && year%100 != 0 || year%400 == 0?29:28;
			break;
		default:
			System.out.print("년월 입력이 잘못되었습니다.");
			return;
		}
		System.out.print(year+"년"+month+"월"+monthlastday+"일");
	}

}
