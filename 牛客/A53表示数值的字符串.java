package 牛客;

import java.util.regex.Pattern;

/**
 * 
 * @author 喻超
 * @date 2019年11月3日 下午12:00:26
 * @Description ac:100%
 *
 */
public class A53表示数值的字符串 {

	public boolean isNumeric(char[] str) {
		return Pattern.matches("[\\-+]?\\d*(\\.\\d+)?([eE][\\-+]?\\d+)?", new String(str));
	}

}
/**
题目描述
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e",
"1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
*/