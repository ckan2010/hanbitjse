package scan;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :ckan
 * @file   :Scan.java
 * @story  :메인 메소드 단축키
 */
public class Scan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : [ ]");
		System.out.println("이름 : " + scanner.next());
		System.out.println("출생년도 : [ ]");
		System.out.println("출생년도 : " + scanner.next());
		System.out.println("거주지 : [ ]");
		System.out.println("거주지 : " + scanner.next());
	}

}
