package 牛客;

import java.util.Arrays;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 上午11:03:41
 * @Description 
 * 思路：二分法遍历查找：时间复杂度O(nlogn)
 * 
 * case通过率为100%
 *
 */
public class A01二维数组中的查找2 {

	public static void main(String[] args) {
		int target = 1;
		int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		//int target = 5;
		//int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(Find(target, array));
	}
	
	public static boolean Find(int target, int [][] array) {
		
		int rows,size;
		
		//判断数组是否为空数组
		if(array.length > 0 && array[0].length > 0) {
			rows = array.length - 1;
			size = array[0].length - 1;
		} else {
			return false;
		}
		
		//判断目标数是否大于最大值或小于最小值
		if(target < array[0][0] || target > array[rows][size]){
			return false;
		}
		
		//二分法遍历查找
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
题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/