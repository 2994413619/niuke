package 牛客;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		/*Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);*/
		
		/*HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("1", 2);
		map.put("1", 4);
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getValue());
		}*/
		
		/*A28数组中出现次数超过一半的数字 test = new A28数组中出现次数超过一半的数字();
		int i = test.MoreThanHalfNum_Solution(new int[]{1,2,3,2,2,2,5,4,2});
		System.out.println(i);*/
		//System.out.println(Pattern.matches("[0-9\\-+]\\d+(.?\\d+)*", "+0123.01012"));
		System.out.println(Pattern.matches("[\\-+]?\\d*(\\.\\d+)?([Ee][\\-+]?\\d+)?", "1+23"));
		System.out.println(Pattern.matches("[\\-+]?(\\d*.\\d+|\\d+)([eE][\\-+]?\\d+)?", "1+23"));
		//System.out.println(Integer.MAX_VALUE);
		
	}
	
}
