package scan;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :ckan
 * @file   :VarEx.java
 * @story  :정수타입 int 더하기 예제 
 */
public class VarEx {
	public static void main(String[] args) {
		/*
		 * 원시변수의 종류 : 총 8종류인데 4가지로 정리됨
		 * int, double, char, boolean
		 * */
		Scanner scanner = new Scanner(System.in);
		int x=0,y=0,z=0;
		System.out.println("정수 x : [ ]");
		x = scanner.nextInt();
		System.out.println("정수 y : [ ]");
		y = scanner.nextInt();
		z = x + y;
		System.out.println("x + y = "+z);
	}

}
