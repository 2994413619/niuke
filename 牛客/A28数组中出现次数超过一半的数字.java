package ţ��;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 
 * @author ����
 * @date 2019��9��7�� ����4:07:53
 * @Description ac:100% 
 *
 */
public class A28�����г��ִ�������һ������� {

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
��Ŀ����
��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
*/