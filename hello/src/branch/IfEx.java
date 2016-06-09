/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :ckan
 * @file   :IfEx.java
 * @story  :Branch 구문 예제
 */
public class IfEx {
	public static void main(String[] args) {
		int input=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		input = scanner.nextInt();
		if (input>10) {
			System.out.println("입력된 값 "+input+" 이 10 보다 큽니다");
		} else {
			System.out.println("입력된 값"+input+"이 10 보다 작거나 같습니다");
		}
	}
}
