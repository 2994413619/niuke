package ţ��;

import java.util.ArrayList;
import java.util.Arrays;

public class A29��С��K���� {

	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(k <= input.length) {
        	Arrays.sort(input);
            
            for(int i = 0; i < k; i++) {
            	list.add(input[i]);
            }
        }
        
        return list;
    }
	
}
/**
��Ŀ����
����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
*/