/***
 * 
 **/
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :ckan
 * @file   :ForLoopEx.java
 * @story  :1부터 10까지 짝수,홀수의 급수는?(단,공차는 1)
 */
public class ForLoopEx3 {
	/**
	 * 
	 **/
	public static void main(String[] args) {
		int i = 0,oddSum = 0,evenSum = 0;
		for (i = 1; i <= 10; i++) {
			if (i%2 == 1) {
				oddSum += i;				
			} else {
				evenSum +=i;
			}
		}
		System.out.printf("%s%d\t%s%d","홀합 : ",oddSum,"짝합 : ",evenSum);
	}
}
