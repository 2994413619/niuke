package ţ��;

import java.util.HashSet;

/**
 * 
 * @author ����
 * @date 2019��11��3�� ����12:00:03
 * @Description ac:100%
 *
 */
public class A50�������ظ������� {

	public boolean duplicate(int numbers[], int length, int[] duplication) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < length; i++) {
			if(set.contains(numbers[i])) {
				duplication[0] = numbers[i];
				return true;
			} else {
				set.add(numbers[i]);
			}
		}
		return false;
	}

}
