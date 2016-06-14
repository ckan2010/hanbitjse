/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :ckan
 * @file   :Num1.java
 * @story  :
 */
public class Num1 {
	/**
	 * 학생수는 입력받습니다.
	 * 학생의 점수만 입력해서
	 * 최고점과 최저점만 출력하는
	 * 로직을 작성하시오
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int studCount = 0,i = 0, maxGrade = 0, minGrade = 100;
		System.out.println("학생수를 입력 하세요 ");
		studCount = scanner.nextInt();
		int score[] = new int[studCount];
		System.out.println("학생 점수 를 입력 하세요 ");
		for (; i < score.length; i++) {
			score[i] = scanner.nextInt();
			if (score[i] > maxGrade ) {
				maxGrade = score[i];				
			} if (score[i] < minGrade){
				minGrade = score[i];
			}
		}
		
		System.out.printf("최고점 : %d\t 최저점 : %d",maxGrade,minGrade);
	}

}
