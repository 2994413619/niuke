package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����2:20:36
 * @Description ac:100%
 *
 */
public class A11��������1�ĸ��� {

	public static void main(String[] args) {
		System.out.println(NumberOf1(1));
	}
	
	public static int NumberOf1(int n) {
		String string = Integer.toBinaryString(n);
		String str1 = string.replaceAll("0", "");
		return str1.length();
    }
	
}
/*
����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
*/