package 牛客;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年9月23日 上午10:28:10
 * @Description ac:100% 
 *
 */
public class A43左旋转字符串 {

	public String LeftRotateString(String str, int n) {
		String string = "";
		if(str != null && !str.equals("")) {
			n = n % str.length();
			string = str.substring(n) + str.substring(0, n);
		}
		return string;
	}
	
	@Test
	public void test() {
		System.out.println(LeftRotateString("",6));
	}

}
