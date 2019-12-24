package 牛客;

import java.util.ArrayList;

/**
 * 
 * @author 喻超
 * @date 2019年9月12日 下午2:17:06
 * @Description ac:100%
 *
 */
public class A40数组中只出现一次的数字 {

	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++) {
			if(!list1.contains(array[i]) && !list2.contains(array[i])) {
				list1.add(array[i]);
			} else if(list1.contains(array[i])) {
				list2.add(array[i]);
				list1.remove(new Integer(array[i]));
			}
		}
		
		num1[0] = list1.get(0);
		num2[0] = list1.get(1);
	}

}
