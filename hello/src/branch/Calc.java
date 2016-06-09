/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :ckan
 * @file   :Calc.java
 * @story  :계산 문제 예제
 */
public class Calc {
	public static void main(String[] args) {
		/*
		 * 두개의 정수를 입력받아서
		 * opcode 값이 1이면 덧셈
		 * 2면 뺄셈
		 * 3이면 곱셈
		 * 4면 나눗셈(몫)
		 * 5면 나머지 구하는 계산기 
		 */
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,calc=0;
		String calcu="",cond="";
		System.out.println("두개의 정수를 입력 하세요 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("계산 수식을 입력해 주세요 : +, -,"
				+ " *, /, % 입니다. ");
		cond = scanner.next();
		if (cond.equals("+")) {
			calc = a+b;
			calcu = "+";
		} else if(cond.equals("-")){
			calc = a-b;
			calcu = "-";
		} else if(cond.equals("*")){
			calc = a*b;
			calcu = "*";
		} else if(cond.equals("/")){
			calc = a/b;
			calcu = "/";
		}else{
			calc = a%b;
			calcu = "%";
		}
		System.out.println("두정수의 계산은 "
				   + "a "+calcu+" b : "+calc+" 입니다.");

	}

}
