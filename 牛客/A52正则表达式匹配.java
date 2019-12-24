package 牛客;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年11月3日 上午12:32:43
 * @Description ac:100%
 *
 */
public class A52正则表达式匹配 {

	public boolean match(char[] str, char[] pattern){
		
		if(str.length == 0 && pattern.length == 0) {
			return true;
		}
		
		String string = new String(str);
		
		String regex = new String(pattern);
		regex = regex.replace(".", "[\\s\\S]");
		
        return Pattern.matches(regex, string);
    }
	
	@Test
	public void test() {
		match(new char[0], new char[] {'.','*'});
		
	}
	
}
/**
题目描述
请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
*/