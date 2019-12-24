package ţ��;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��12��16�� ����10:22:48
 * @Description ac:100%
 *
 */
public class A66�����˵��˶���Χ {
	
	private int count = 0;
	
	private int myThreshold;
	private int myRows;
	private int myCols;
	private Boolean[][] array;

	public int movingCount(int threshold, int rows, int cols) {
		
		myThreshold = threshold;
		myRows = rows;
		myCols = cols;
		array = new Boolean[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				array[i][j] = false;
			}
		}
		
		move(0, 0);
		
		return count;
		
	}
	
	public void move(int i, int j) {
		
		if(add(i, j) <= myThreshold) {
			array[i][j] = true;
			count++;
				
			//�����ƶ�
			if(i - 1 >= 0 && !array[i - 1][j]) {
				move(i - 1, j);
			}
			//�����ƶ�
			if(i + 1 < myRows && !array[i + 1][j]) {
				move(i + 1, j);
			}
			//�����ƶ�
			if(j - 1 >= 0 && !array[i][j - 1]) {
				move(i, j - 1);
			}
			//�����ƶ�
			if(j + 1 < myCols && !array[i][j + 1]) {
				move(i, j + 1);
			}
		}
			
	}
	
	//�����ֵ
	public int add(int a, int b) {
		int sum = 0;
		
		while(a > 0) {
			sum += a % 10;
			a /= 10;
		}
		
		while(b > 0) {
			sum += b % 10;
			b /= 10;
		}
		
		return sum;
	}
	
	@Test
	public void test() {
		System.out.println(movingCount(15, 20, 20));
	}
	
}
