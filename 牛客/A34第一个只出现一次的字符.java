package ţ��;

import java.util.ArrayList;

/**
 * 
 * @author ����
 * @date 2019��9��11�� ����12:05:40
 * @Description ac:100%
 *
 */
public class A34��һ��ֻ����һ�ε��ַ� {

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
		A34��һ��ֻ����һ�ε��ַ� test = new A34��һ��ֻ����һ�ε��ַ�();
		int index = test.FirstNotRepeatingChar("asdfasdfg");
		System.out.println(index);
		
	}
	
}
/**
��Ŀ����
��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
*/