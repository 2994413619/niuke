package ţ��;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��9��23�� ����10:28:10
 * @Description ac:100% 
 *
 */
public class A43����ת�ַ��� {

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
