/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :ckan
 * @file   :Kaup.java
 * @story  :카우푸지수 구하는 프로그램
 */
public class Kaup {
	/**
	 * 개발자님 프로그램 제작의뢰입니다.
	 * 비만지수를 구하는 것인데요
	 * 키와 몸무게를 입력하면 당사자가
	 * 비만인지 저체중인지 알려주는
	 * 프로그램을 만들어 주세요.
	 * 돈은 입금했습니다.
	 * 잘은 모르는데 kaup 공식을 쓰면
	 * 된다고 하네요. 공식은 나도 몰라요
	 * 알아서 하삼....
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double weigh=0.0,height=0.0,chheig=0.0,bmigisu=0.0;
		String name="",bmi="";
		System.out.print("성명 을 입력 하세요: ");
		name = scanner.next();
		System.out.print("키 를 입력 하세요: ");
		height = scanner.nextDouble();
		System.out.print("몸무게 를 입력 하세요: ");
		weigh = scanner.nextDouble();
		chheig = height * 0.01;
		bmigisu = weigh/chheig/chheig;
		if (bmigisu < 18.5) {
			bmi = "저체중";
		} else if(bmigisu >= 18.5 && bmigisu <= 22.9){
			bmi = "정상체중";
		} else if(bmigisu >= 23.0 && bmigisu <= 24.9 ){
			bmi = "과체중(위험체중)";			
		} else if(bmigisu >= 25.0 && bmigisu <= 29.9 ){
			bmi = "과체중(비만 1단계)";
		} else if(bmigisu >= 30.0 && bmigisu <= 39.9 ){
				bmi = "과체중(비만 2단계)";			
		} else if(bmigisu >= 40.0 ){
			bmi = "과체중(비만 3단계)";			
		} else {
			System.out.println(name+" 님 BMI 지수 구하기 오류입니다.");
			return;
		}
		System.out.println(name+" 님 BMI 수치 : "+bmigisu+" 이고 "+bmi+" 입니다.");
	}
}
