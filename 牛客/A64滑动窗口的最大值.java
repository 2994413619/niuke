package ţ��;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author ����
 * @date 2019��12��11�� ����10:10:43
 * @Description ac:100% 
 *
 */
public class A64�������ڵ����ֵ {

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(size <= 0) {
			return list;
		}
		
		int[] copyOfRange;
		
		int i = 0;
		while(i + size <= num.length) {
			copyOfRange  = Arrays.copyOfRange(num, i, i + size);
			Arrays.sort(copyOfRange);
			list.add(copyOfRange[copyOfRange.length - 1]);
			
			i++;
		}
		
		return list;
	}

}
/**
 * ��Ŀ���� ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}��
 * �������{2,3,4,2,6,2,5,1}�Ļ�������������6���� {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}��
 * {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}��
 * {2,3,4,2,6,[2,5,1]}��
 */