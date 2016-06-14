/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date :2016. 6. 14.
 * @author :ckan
 * @file :ArrAssign.java
 * @story :
 */
public class ArrAssign2 {
	public static void main(String[] args) {
		/**
		 * 전교생이 몇명인지 몰라요. 
		 * 전교생 수를 입력받고 
		 * 학생의 이름과 점수를 
		 * 입력받고, 이것을 1등부터 꼴등까지 출력하세요
		 **/
		Scanner scanner = new Scanner(System.in);
		int studCount = 0,i = 0,j = 0;
		System.out.println("학생 수가 몇명입니까? ");
		studCount = scanner.nextInt();
		System.out.println(studCount + " 명의 이름,나이를 입력하세요 ");
		String studunte[] = new String[studCount];
		int age[] = new int[studCount];
		int id[] = new int[studCount];

		for (; i < studunte.length; i++) {
			j++;
            id[i] = j;
			studunte[i] = scanner.next();
			age[i] = scanner.nextInt();
		}
		i = 0;
		System.out.println("===================================\n");
		System.out.println("학번 | 이름 | 나이 \n");
		for (; i < age.length; i++) {
			System.out.printf("%d\t%s\t%d\n",id[i],studunte[i],age[i]);
		}
		System.out.println("===================================\n");

	}

}
