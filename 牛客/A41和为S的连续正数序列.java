package ţ��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��9��12�� ����11:47:50
 * @Description ac:100%
 *
 */
public class A41��ΪS�������������� {

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		int i = 1,temp;
		while(i < sum) {
			if(sum % i == 0) {//sum = i * temp
				temp = sum / i;
				
				if(temp < i / 2) {//����ѭ������
					break;
				}
				
				//��������ۣ��������
				if(i % 2 == 0 && temp % 2 == 0) {//1��i:ż����temp:ż�����޷��������
					i++;
					continue;
				} else if(i % 2 == 0 && temp % 2 != 0) {//2��i:ż����temp:���������г���Ϊ2*i
					int size = i * 2;
					if(temp < size) {//���Ȳ����������
						continue;
					}
					
					ArrayList<Integer> childList = new ArrayList<Integer>();
					
					for(int j = temp / 2 - i + 1; j <= temp / 2 - i + size; j++) {//��������
						childList.add(j);
					}
					
					list.add(childList);
					
				} else if(i % 2 != 0) {//3��i:������temp:ż��/���������г���Ϊi
					
					int size;
					ArrayList<Integer> childList = new ArrayList<Integer>();
					
					if(i == 1 && temp % 2 != 0) {
						size = 2;
						childList.add(temp / 2);
						childList.add(temp / 2 + 1);
						list.add(childList);
					} else if(i != 1) {
						size = i;
						for(int j = temp - size / 2; j <= temp + size / 2; j++) {
							childList.add(j);
						}
						list.add(childList);
					}
					
				}
				
			}
			
			i++;
			
		}
		
		//��list����
		Collections.sort(list, new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				if(o1.get(0) < o2.get(0)) {
					return -1;
				}
				return 1;
			}
		});
		
		
		return list;
		
	}
	
	
	@Test
	public void test() {
		FindContinuousSequence(9);
	}

}
/**
��Ŀ����
С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
�������:
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
*/