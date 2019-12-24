package ţ��;

import java.util.ArrayList;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����4:28:50
 * @Description ac��100%
 *
 */
public class A19˳ʱ���ӡ���� {
	
	//����
	public static void main(String[] args) {
		//int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] matrix = {{1}};
		
		ArrayList<Integer> list = printMatrix(matrix);
		System.out.println(list);
	}
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = matrix.length;
		if(n == 0) {
			return null;
		}
		int m = matrix[0].length;
		
		int min = m < n ? m : n;//�ø�С��ά�ȼ���ѭ������
		int times = (int)Math.ceil(min / 2.0);//ѭ������
		
		for(int i = 0; i < times; i++) {//ÿ�Σ���һ��Ԫ�ؾ���matrix[i][i]
			//�������
			for(int j = i; j < m - i; j++) {
				list.add(matrix[i][j]);
			}
			//�������
			for(int j = i + 1; j < n - 1 - i; j++) {
				list.add(matrix[j][m - 1 - i]);
			}
			//�������
			for(int j = m - 1 - i; j >= i; j--) {
				if(n - 1 - i > i) {//��ֹ�ظ����
					list.add(matrix[n - 1 - i][j]);
				}
			}
			//�������
			for(int j = n -2 -i; j > i; j--) {
				if(i < m - 1 - i) {//��ֹ�ظ����
					list.add(matrix[j][i]);
				}
			}
		}
		
		return list;
		
    }
	
}
/*
��Ŀ����
����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬�����������4 X 4���� 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 4, 3, 2, 6, 7, 11, 10, 7]
*/