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
public class Avg2 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국,영,수 세과목점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균***점,학점 : F
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 * 평균점수가 90점 이상 A 
	 * 80점 이상이면 B
	 * 70점 이상이면 C
	 * 60점 이상이면 D
	 * 50점 이상이면 E
	 * 40점 이상이면 F 학점입니다라고
	 * 출력되게 해주세요
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
		if (kor > 100 || kor < 0){
			System.out.println("국어 점수는 0~100 까지 가능합니다. ");
			return;
		}
		eng = scanner.nextInt();
		if (eng > 100 || eng < 0){
			System.out.println("영어 점수는 0~100 까지 가능합니다. ");
			return;
		}
		math = scanner.nextInt();
		if (math > 100 || math < 0){
			System.out.println("수학 점수는 0~100 까지 가능합니다. ");
			return;
		}
		total = kor+eng+math;
		avg = total/3;
		if (avg >= 90 && avg <= 100) {
			pass = "A";
		} else if (avg < 90 && avg >= 80) {
			pass = "B";
		} else if (avg < 80 && avg >= 70) {
			pass = "C";
		} else if (avg < 70 && avg >= 60) {
			pass = "D";
		} else if (avg < 60 && avg >= 50) {
			pass = "E";
		} else if(avg < 50 ){
			pass = "F";			
		} else {
			System.out.println("평균 점수는 0~100 까지 가능 합니다. ");
			return;
		}
		//-----------------------출력부(콘솔)--------------------------------------
		System.out.println("["+name+" : 총점 "+total+" 점, 평균 "
				+avg+" 점,학점 : "+pass+" ]");
	}

}
