package ţ��;

import java.util.Arrays;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����11:03:41
 * @Description 
 * ˼·�����ַ��������ң�ʱ�临�Ӷ�O(nlogn)
 * 
 * caseͨ����Ϊ100%
 *
 */
public class A01��ά�����еĲ���2 {

	public static void main(String[] args) {
		int target = 1;
		int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		//int target = 5;
		//int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(Find(target, array));
	}
	
	public static boolean Find(int target, int [][] array) {
		
		int rows,size;
		
		//�ж������Ƿ�Ϊ������
		if(array.length > 0 && array[0].length > 0) {
			rows = array.length - 1;
			size = array[0].length - 1;
		} else {
			return false;
		}
		
		//�ж�Ŀ�����Ƿ�������ֵ��С����Сֵ
		if(target < array[0][0] || target > array[rows][size]){
			return false;
		}
		
		//���ַ���������
		int temp;
		for(int i = 0; i <= rows; i++) {
			temp = Arrays.binarySearch(array[i], target);
			if(temp >= 0) {
				return true;
			}
		}
		
		return false;
    }
	
}

/**
��Ŀ����
��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
*/