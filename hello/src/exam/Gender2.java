/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :ckan
 * @file   :Gender.java
 * @story  :
 */
public class Gender2 {
	/**
	 * 개발자님 저희 사이트는 주민번호 앞자리와 성별
	 * 판별번호만 입력합니다.
	 * 예를들어 800101-1 까지만 입력하면
	 * 주민번호는 숫자로만 입력 한다는 정의하에 한다.
	 * 소비자가 자신이 남자인지 여자인지 밝히지 않아도
	 * 자동으로 DB에 저장되는 시스템을 개발해주세요.
	 * [출력문] 홍길동(남), 아이유(여)
	 **/
	/*1,2 : 국내 1900년대생 남,녀

	3,4 : 국내 2000년대생 남,녀
	5,6 : 외국 1900년대생 남,녀
	7,8 : 외국 2000년대생 남,녀*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		String name="",jumin="",gender="여";
		System.out.println("성명 : ");
		name = scanner.next();
		System.out.println("주민번호 [예 xxxxxx-x] : ");
		jumin = scanner.next();
		char gendergubun = jumin.charAt(7);
		if (gendergubun == '0' || gendergubun == '9') {
			System.out.println("남여 구분은 0,9는 없습니다. ");
			return;
		}
		if (gendergubun%2 == 1) {
			gender = "남";
		}
		System.out.println(name+"("+gender+")");
	}
}
