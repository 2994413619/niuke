package ţ��;

import org.junit.Test;

public class A30��������������� {
	public int FindGreatestSumOfSubArray(int[] array) {
		int max = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			count += array[i];
            max = max > count ? max : count;
			if(count < 0) {
				count = 0;
			}
		}
		
		return max;
	}
	
	@Test
	public void test() {
		int max = FindGreatestSumOfSubArray(new int[] {6,-3,-2,7,-15,1,2,2});
		System.out.println(max);
	}
}
/**
 * ��Ŀ���� HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:
 * �ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},
 * ����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 */