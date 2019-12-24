package 牛客;

import java.util.LinkedList;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年11月3日 下午12:22:31
 * @Description ac:100%
 *
 */
public class A54字符流中第一个不重复的字符 {
	
	LinkedList<Character> noRepeat = new LinkedList<Character>();
	LinkedList<Character> Repeat = new LinkedList<Character>();

	// Insert one char from stringstream
	public void Insert(char ch) {
		if(!noRepeat.contains(ch) && !Repeat.contains(ch)) {
			noRepeat.add(ch);
		} else if(noRepeat.contains(ch)) {
			noRepeat.remove((Object)ch);
			Repeat.add(ch);
		}
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		if(noRepeat.size() == 0) {
			return '#';
		}
		return noRepeat.get(0);
	}
	
	@Test
	public void test() {
		A54字符流中第一个不重复的字符 aa = new A54字符流中第一个不重复的字符();
		aa.Insert('g');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('o');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('o');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('g');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('l');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('e');
		System.out.print(aa.FirstAppearingOnce());
	}

}
/**
 * 题目描述
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
输出描述:
如果当前字符流没有存在出现一次的字符，返回#字符。
*/
