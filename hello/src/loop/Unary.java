/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :ckan
 * @file   :Unary.java
 * @story  :
 */
public class Unary {
	public static void main(String[] args) {
		int c; // c라는 주소값에 메모리를 생성해라
		c=1; // c라는 메모리공간에 1을 할당하라
		int a = 0, b = 0;
		System.out.printf("a++ = %d \n",a++); // 시작점 그자신 자신을 보여주고 연산을 오버로딩 함
		System.out.printf("++b = %d",++b);    // 시작점 은 연산 한걸 보여준다.
	}

}
