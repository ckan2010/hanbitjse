/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :ckan
 * @file   :Avg.java
 * @story  :평균값 구하기 예제
 */
public class Avg {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국,영,수 세과목점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균***점,합격여부(불합격)]
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 * 평균점수가 60점 미만이면 불합격, 이상이면 합격입니다.
	 */
	public static void main(String[] args) {
		//------------- 변수 선언부,준비,초기화(init)-----------------------------
		Scanner scanner = new Scanner(System.in);
		int kor=0,eng=0,math=0,total=0,avg=0;
		String name="",pass="";
		// -------------------- 연산부 (알고리즘)----------------------------------
		System.out.println("이름을 입력 하세요 : ");
		name = scanner.nextLine();
		System.out.println("국어,영어,수학 점수를 입력 하세요 : ");
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		total = kor+eng+math;
		avg = total/3;
		if (avg >= 60) {
			pass = "합격";
		} else {
			pass = "불합격";
		}
		//-----------------------출력부(콘솔)--------------------------------------
		System.out.println("["+name+" : 총점 "+total+" 점, 평균 "
				+avg+" 점,합격여부("+pass+"])");
	}

}
