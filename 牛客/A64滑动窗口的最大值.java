package 牛客;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author 喻超
 * @date 2019年12月11日 下午10:10:43
 * @Description ac:100% 
 *
 */
public class A64滑动窗口的最大值 {

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
 * 题目描述 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}，
 * {2,3,4,2,6,[2,5,1]}。
 */