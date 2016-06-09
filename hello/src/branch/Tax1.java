/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :ckan
 * @file   :Tax1.java
 * @story  :Branch Tax1 예제
 */
public class Tax1 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력받아서
	 * 연봉 ***원을 받으시는 xxx님께서 납부할 세금은 ???원입니다.
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정책이 바뀔 때 마다 변하니,
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요.
	 * 현재는 세율이 9.7프로인데, 만약 세율이 바뀌면
	 * 바뀐 세율을 적용바랍니다.
	 * 
	 */
	public static void main(String[] args) {
		int sal=0, money=0;
		double tax=0.0;
		String name="",fsal="",fmoney="",cond="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요 : ");
		name = scanner.next();
		System.out.println("월급을 입력해 주세요 : ");
		sal = scanner.nextInt();
		System.out.println("세율이 바뀌었습니까?"
				+ "그대로이면 N 바뀌었으면 Y 을 입력하세요 ");
		cond = scanner.next();
		if (cond.equals("N")) {
			tax=0.097;
			
		} else {
			System.out.println("그럼, 바뀐세율을 입력바랍니다.");
			tax = scanner.nextDouble();
		}
		money = (int) (sal*tax);
		fsal = String.format("%,d",sal);
		fmoney = String.format("%,d",money);
		System.out.println("연봉 "+fsal+" 원을 받으시는 "+name+"님께서 납부할 세금은 "
				+ fmoney+" 원 입니다.");
	}

}
