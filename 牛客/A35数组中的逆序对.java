package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年9月12日 下午12:08:42
 * @Description ac:75% 运行超时
 * 算法：归并排序
 *
 */
public class A35数组中的逆序对 {
	
	private int count;

	public int InversePairs(int[] array) {
		
		if(array == null || array.length == 0) {
			return 0;
		}
		
		merge(array, 0, array.length - 1);
		
		return count;
		
	}
	
	//归并排序
	public void merge(int[] array,int left, int right) {
		int size = right - left + 1;
		if(size > 1) {
			int childSize = (int) Math.ceil(size / 2.0);
			
			//给左子数组归并排序
			merge(array, left, left + childSize - 1);
			
			//给右子数组归并排序
			merge(array, left + childSize, right);
			
			//合并两个子数组
			int leftPoint = left;
			int rightPoint = left + childSize;
			
			//计算两个子数组的逆序对个数
			for(int i = left + childSize; i <= right; i++) {
				for(int j = left; j <= left + childSize - 1; j++) {
					if(array[i] < array[j]) {
						count += left + childSize - j;
						if(count >= 1000000007) {
							count %= 1000000007;
						}
						break;
					}
				}
			}
			
			int[] temp = new int[size];//暂存排好序的合并数组
			for(int i = 0; i < size; i++) {//给两个子数组排序，暂存到temp中
				
				if(leftPoint <= left + childSize - 1 && rightPoint <= right) {
					if(array[leftPoint] <= array[rightPoint]) {
						temp[i] = array[leftPoint];
						leftPoint++;
					} else {
						temp[i] = array[rightPoint];
						rightPoint++;
					}
				} else if(rightPoint <= right) {
					temp[i] = array[rightPoint++];
				} else if(leftPoint <= left + childSize - 1) {
					temp[i] = array[leftPoint++];
				}
				
			}
			
			//排好序的数组替代原数组中未排序的数组
			for(int i = 0; i < size; i++) {
				array[left + i] = temp[i];
			}
				
		}
	}
	
	public static void main(String[] args) {
		A35数组中的逆序对 test = new A35数组中的逆序对();
		//int[] array = {1,2,3,4,5,6,7,0};
		int[] array = {1,5,748,7,54,54,87,54,54,51,57,877,684,65,4,57,8,456,4,56,7,561,564,87,56,4,564,87,54,65,111,433,1345343123,11234,12534,65234,5112,341,234,1,235,5,324,6,45,64,7,4567,58,678,7,67,234,345,6234,2,34};
		System.out.println(test.InversePairs(array));
	}

}
/*
题目描述
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
*/