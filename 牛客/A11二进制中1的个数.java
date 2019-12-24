package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 上午2:20:36
 * @Description ac:100%
 *
 */
public class A11二进制中1的个数 {

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
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
*/