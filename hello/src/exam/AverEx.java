/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :ckan
 * @file   :AverEx.java
 * @story  :평균값 구하기 예제
 */
public class AverEx {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국,영,수 세과목점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균***점]
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor=0,eng=0,meth=0,tot=0,aveg=0;
		double ave=0.0;
		String name="";
		System.out.println("이름을 입력 하세요 : ");
		name = scanner.nextLine();
		System.out.println("국어,영어,수학 점수를 입력 하세요 : ");
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		meth = scanner.nextInt();
		tot = kor+eng+meth;
		ave = tot/3;
		aveg = (int)ave;
		System.out.println("["+name+" : 총점 "+tot+"점, 평균"+aveg+"점]");
	}

}
