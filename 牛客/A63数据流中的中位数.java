package ţ��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A63�������е���λ�� {
	
	private List<Integer> list = new ArrayList<Integer>();

	public void Insert(Integer num) {
		list.add(num);
		Collections.sort(list);
	}

	public Double GetMedian() {
		
		double result;

		if(list.size() % 2 == 0) {
			result = ((list.get(list.size() / 2)) + (list.get(list.size() / 2 - 1))) / 2.0;
		} else {
			result = list.get(list.size() / 2);
		}
		
		return result;
		
	}

}
/**
 * ��Ŀ���� ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 * ����ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 */