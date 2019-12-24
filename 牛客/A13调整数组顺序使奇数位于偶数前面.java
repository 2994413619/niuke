package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 上午2:39:08
 * @Description ac:100%
 * 思路：从中向右遍历数组，记录下最左边偶数的下标n，从这个偶数开始，遇到一个奇数（下标m），则n到m-1全部向右移动一位，m位置的奇数到n,如此执行，直到循环结束
 *
 */
public class A13调整数组顺序使奇数位于偶数前面 {
	
	//测试
	public static void main(String[] args) {
		int[] array = {15,48,75,15,48,79,22,69,23,15,48};
		reOrderArray(array);
		
	}

	public static void reOrderArray(int [] array) {
		int n = -1,temp;
        for(int i = 0; i < array.length; i++) {
        	if(n == -1) {
        		if(array[i] % 2 == 0) {
        			n = i;
        		}
        	} else {
        		if(array[i] % 2 == 1) {
        			temp = array[i];
        			//往后移动
        			for(int j = i; j >= n + 1; j--) {
        				array[j] = array[j - 1];
        			}
        			array[n] = temp;
        			++n;
        		}
        	}
        }
    }
	
}
/*
题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*/