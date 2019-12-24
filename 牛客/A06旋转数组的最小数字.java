package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午3:19:13
 * @Description 通过：100%
 *
 */
public class A06旋转数组的最小数字 {
	
	public static void main(String[] args) {
		int[] array = {3,4,5,1,2};
		System.out.println(minNumberInRotateArray(array));
	}

	public static int minNumberInRotateArray(int [] array) {
		if(array == null || array.length == 0) {
			return 0;
		}
		
		int num = array[array.length - 1];
	    for(int i = array.length - 1; i >= 0; i--) {
	    	if(array[i] > num ) {
	    		break;
	    	} else {
	    		num = array[i];
	    	}
	    }
	    
	    return num;
    }
	
}
/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*/