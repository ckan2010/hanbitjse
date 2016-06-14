/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 14.
 * @author :ckan
 * @file   :ForLoopEx7.java
 * @story  :init=10, limit=10, diff=2 인 reverse sequences
 */
public class ForLoopEx7 {
	public static void main(String[] args) {
		int j = 10 ;
		for (; j > -1; j-=2) {
			System.out.printf("%d\t",j);
		}
	}

}
