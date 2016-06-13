/***
 * 
 **/
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :ckan
 * @file   :ForLoopEx.java
 * @story  :3의배수를 제외한 1부터 10까지 급수는?
 * (단,공차는 1..!,els if 사용하지 말것)
 */
public class ForLoopEx6 {
	/**
	 * 
	 **/
	public static void main(String[] args) {
		int i = 0,evenSum = 0;
		for (i = 1; i <= 10; i++) {
			
			switch (i%3) {
			case 0:
				continue;

			default:
				evenSum += i;
				break;
		    }
		}	
		System.out.printf("%d\t",evenSum);
	}
}
