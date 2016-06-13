/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :ckan
 * @file   :ForLoopBase.java
 * @story  :Loop 예제 1번째
 */
public class ForLoopBase {
	public static void main(String[] args) {
		/**
		 * 1
		 * 2
		 * 3
		 * .
		 * .
		 * 10
		 * 단,loop 은 사용하지 마셈
		 **/
		int a = 0;
		a = 1;
		System.out.println(a);
		a+=2; // -> a++ 단축키 a = a + 1 오버로딩
		System.out.println(a);
		a+=2; // a = a+2
		System.out.println(a);
		a+=2;
		System.out.println(a);
		a+=2;
		System.out.println(a);
	}

}
