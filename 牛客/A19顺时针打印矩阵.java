package 牛客;

import java.util.ArrayList;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 下午4:28:50
 * @Description ac：100%
 *
 */
public class A19顺时针打印矩阵 {
	
	//测试
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
		
		int min = m < n ? m : n;//用更小的维度计算循环次数
		int times = (int)Math.ceil(min / 2.0);//循环次数
		
		for(int i = 0; i < times; i++) {//每次，第一个元素就是matrix[i][i]
			//向右输出
			for(int j = i; j < m - i; j++) {
				list.add(matrix[i][j]);
			}
			//向下输出
			for(int j = i + 1; j < n - 1 - i; j++) {
				list.add(matrix[j][m - 1 - i]);
			}
			//向左输出
			for(int j = m - 1 - i; j >= i; j--) {
				if(n - 1 - i > i) {//防止重复输出
					list.add(matrix[n - 1 - i][j]);
				}
			}
			//向上输出
			for(int j = n -2 -i; j > i; j--) {
				if(i < m - 1 - i) {//防止重复输出
					list.add(matrix[j][i]);
				}
			}
		}
		
		return list;
		
    }
	
}
/*
题目描述
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 4, 3, 2, 6, 7, 11, 10, 7]
*/