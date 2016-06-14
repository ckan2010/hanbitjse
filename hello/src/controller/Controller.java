/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 14.
 * @author :ckan
 * @file   :Controller.java
 * @story  :1->년월일  2 : Tax ,3 : kaup, 4 :
 */
public class Controller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String menu = "";
		
		while (true) {
			menu = JOptionPane.showInputDialog("1.계산기 2.카우프구하기 3.년월말구하기 0.종료");
			switch (menu) {
			case "1":
				calc(scanner);
				break;
			case "2":
				kaup(scanner);
				break;
			case "3":
				yearmonthlastday(scanner);
				break;
			case "0":
				JOptionPane.showConfirmDialog(null,"종료하시겠습니다까?");
				return;
			default:
				JOptionPane.showMessageDialog(null, "메뉴에 없는 번호 입니다.");
				break;
			}
			System.out.println();
		}
	}

	/**
	 * @param scanner
	 */
	private static void yearmonthlastday(Scanner scanner) {
		int year = 0, month = 0,monthlastday = 0;
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
		System.out.printf("%d%s%d%s%d%s",year,"년",month,"월",monthlastday,"일");
	}

	/**
	 * @param scanner
	 */
	private static void kaup(Scanner scanner) {
		double height = 0.0, weight = 0.0, bmigisu = 0.0;
		String name = "",kaupu = "";
		System.out.println("이름,키,몸무게 ?");
		name = scanner.next();
		height = scanner.nextDouble();
		weight = scanner.nextDouble();
		bmigisu = weight/(height/100)/(height/100);
		if (bmigisu < 18.5) {
			kaupu = "저체중";
		} else if (bmigisu >= 18.5 && bmigisu <= 22.9) {
			kaupu = "정상체중";
		} else if (bmigisu >= 23.0 && bmigisu <= 24.9 ) {
			kaupu = "과체중(위험체중)";	
		} else if (bmigisu >= 25.0 && bmigisu <= 29.9) {
			kaupu = "과체중(비만 1단계)";
		} else if (bmigisu >= 30.0 && bmigisu <= 39.9) {
			kaupu = "과체중(비만 2단계)";
		} else if (bmigisu >= 40.0) {
			kaupu = "과체중(비만 3단계)";
		} else {
			System.out.println(name+" 님 result 지수 구하기 오류입니다.");
			return;
		}
		System.out.printf("%s%s%.2f%s%s%s",name," 은 result 지수는 ",bmigisu," 이고, ",kaupu," 이다 ");
	}

	/**
	 * @param scanner
	 */
	private static void calc(Scanner scanner) {
		int num1 = 0,num2 = 0,result = 0;
		String opcode = "";
		System.out.print("첫번째 숫자 : ");
		num1   = scanner.nextInt();
		System.out.print("연산자 : ");
		opcode = scanner.next();
		System.out.print("두번째 숫자 : ");
		num2 = scanner.nextInt();
		switch (opcode) {
		case "+":
			result  = num1 + num2;
			opcode = "+";
			break;
		case "-":
			result  = num1 - num2;
			opcode = "-";
			break;
		case "*":
			result  = num1 * num2;
			opcode = "*";
			break;	
		case "/":
			result  = num1 / num2;
			opcode = "/";
			break;	
		case "%":
			result  = num1 % num2;
			opcode = "%";
			break;
		default:
			System.out.println("연산자 는 +,-,*,/,% 중 하나 입니다.");
			break;
		}
		System.out.println(num1+opcode+num2+"="+result);
	}
}
