/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :ckan
 * @file   :Calc1.java
 * @story  :계산 예제 1
 */
public class Calc1 {
	public static void main(String[] args) {
		//---------init-------------------------------------------------
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,resu=0;
		String opcode="",condi="";
		//---------op---------------------------------------------------
		System.out.print("첫번째숫자 : ");
		num1 = scan.nextInt();
		System.out.print("연산자 : ");
		condi = scan.next();
		System.out.print("두번째숫자 : ");
		num2 = scan.nextInt();
		switch (condi) {
		case "+":
			resu  = num1 + num2;
			opcode = "+";
			break;
		case "-":
			resu  = num1 - num2;
			opcode = "-";
			break;
		case "*":
			resu  = num1 * num2;
			opcode = "*";
			break;
		case "/":
			resu  = num1 / num2;
			opcode = "/";
			break;
		case "%":
			resu  = num1 % num2;
			opcode = "%";
		default:
			System.out.println("연산자 는 +,-,*,/,% 중 하나 입니다.");
			return;
		}
		
		//------------콘솔--------------------------------------------
		System.out.println(num1+opcode+num2+"="+resu);
	}

}
