package 牛客;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 
 * @author 喻超
 * @date 2019年9月7日 下午4:07:53
 * @Description ac:100% 
 *
 */
public class A28数组中出现次数超过一半的数字 {

	public int MoreThanHalfNum_Solution(int [] array) {
        int result = 0;
        int size = array.length;
        
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        
        for(int i = 0; i < size; i++) {
        	if(map.containsKey(array[i] + "")) {
        		Integer count = map.get(array[i] + "");
        		map.put(array[i] + "",++count);
        	} else {
        		map.put(array[i] + "", 1);
        	}
        }
        
        int maxSize = 0;
        int num = Integer.MAX_VALUE;
        
        for (Entry<String, Integer> entry : map.entrySet()) {
			if(maxSize < entry.getValue()) {
				maxSize = entry.getValue();
				num = Integer.parseInt(entry.getKey());
			}
		}
        
        if(maxSize >= size / 2 + 1) {
        	result = num;
        }
        
        return result;
    }
	
}
/**
题目描述
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
*/