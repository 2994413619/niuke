package 牛客;

import java.util.regex.Pattern;

/**
 * 
 * @author 喻超
 * @date 2019年11月2日 下午11:15:09
 * @Description ac:100%
 *
 */
public class A49把字符串转换成整数 {

	public int StrToInt(String str) {
		long result = 0;
		//1.字符串符合格式，进行转换;小数：[0-9\\-+]\\d+(.?\\d+)?
		if(Pattern.matches("[0-9\\-+]\\d+", str)) {
			//1.1如果是负数
			if(str.charAt(0) == '-') {
				//1.1.1去除减号
				str = str.substring(1);
				//1.1.2转换为数字
				int length = str.length();
				for(int i = 0; i < str.length(); i++) {
					result -= ((str.charAt(i) - '0') * Math.pow(10, --length));
				}
				//1.1.3判断是否超出整型的数字范围
				if(result < Integer.MIN_VALUE) {
					result = 0;
				}
			} else {//1.2如果是正数
				//1.2.1去除加号
				if(str.charAt(0) == '+') {
					str = str.substring(1);
				}
				//1.2.2转换为数字
				int length = str.length();
				for(int i = 0; i < str.length(); i++) {
					result += (str.charAt(i) - '0') * Math.pow(10, --length);
				}
				//1.2.3判断是否超出整型的数字范围
				if(result > Integer.MAX_VALUE) {
					result = 0;
				}
			}
			
		}
		
		return (int) result;
		
	}
	
	@org.junit.Test
	public void test() {
		System.out.println(StrToInt("-2147483648"));
	}

}
/**
 * 题目描述 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空 输出描述: 如果是合法的数值表达则返回该数字，否则返回0 示例1 输入 复制 +2147483647 1a33
 * 输出 复制 2147483647 0
 */