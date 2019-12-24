package 牛客;

import java.util.ArrayList;

/**
 * 
 * @author 喻超
 * @date 2019年9月23日 上午9:58:05
 * @Description ac:10%
 *
 */
public class A42和为S的两个数字 {

	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		
		ArrayList<Integer> list = null;
		
		int number = Integer.MAX_VALUE;
		
		for(int  i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] + array[j] == sum && array[i] * array[j] < number) {
					list = new ArrayList<Integer>();
					list.add(array[i]);
					list.add(array[j]);
					number = array[i] * array[j];
				}
			}
		}
		
		if(list == null) {
			list = new ArrayList<Integer>();
		}
		
		return list;
	}

}
