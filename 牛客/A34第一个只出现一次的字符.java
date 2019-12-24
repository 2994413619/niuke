package 牛客;

import java.util.ArrayList;

/**
 * 
 * @author 喻超
 * @date 2019年9月11日 下午12:05:40
 * @Description ac:100%
 *
 */
public class A34第一个只出现一次的字符 {

	public int FirstNotRepeatingChar(String str) {
		
		if(str.length() == 0) {
			return -1;
		}
		
        ArrayList<Character> list1 = new ArrayList<Character>();
        ArrayList<Character> list2 = new ArrayList<Character>();
        
        char temp;
        for(int i = 0; i < str.length(); i++) {
        	temp = str.charAt(i);
        	if(!list1.contains(temp) && !list2.contains(temp)) {
        		list1.add(temp);
        	} else if(list1.contains(temp) && !list2.contains(temp)) {
        		int count = 0;
        		for(char x: list1) {
        			if(x == temp) {
        				list1.remove(count);
        				break;
        			}
        			count++;
        		}
        		
        		list2.add(temp);
        	}
        }
        
        return str.indexOf(list1.get(0));
        
    }
	
	public static void main(String[] args) {
		A34第一个只出现一次的字符 test = new A34第一个只出现一次的字符();
		int index = test.FirstNotRepeatingChar("asdfasdfg");
		System.out.println(index);
		
	}
	
}
/**
题目描述
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
*/