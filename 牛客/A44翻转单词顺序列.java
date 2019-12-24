package 牛客;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年10月14日 下午10:43:55
 * @Description ac:100%
 *
 */
public class A44翻转单词顺序列 {

	public String ReverseSentence(String str) {
		
		//这里为什么要用trim，我也有点晕，看的评论。。。因为不用过不了
		if(str == null || str.trim().equals(" ")) {
			return str;
		}
		
		String[] split = str.split(" ");
		StringBuffer result = new StringBuffer();
		for(int i = split.length - 1; i >= 0; i--) {
			if(i == split.length - 1) {
				result.append(split[i]);
			} else {
				result.append(" " + split[i]);
			}
		}
		return result.toString();
	}
	
	@Test
	public void test() {
		System.out.println(ReverseSentence(" "));
	}

}
/**
 * 题目描述
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
 * 但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a
 * student.”。 Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */