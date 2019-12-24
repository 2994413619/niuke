package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 上午11:03:41
 * @Description 
 * 思路：先找到一个区间，然后遍历区间中的数，因为在一个矩形的区域中，左上角的数最小，右上角的数最大
 * 所以先找到最大左角n，最小右上角的数m，然后遍历其中的所有数，n <targer < m
 * 
 * case通过率为64.71%
 *
 */
public class A01二维数组中的查找1 {

	public static void main(String[] args) {
		//int target = 7;
		//int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int target = 5;
		int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
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
		
		int bigI,bigJ;//最大临界点的坐标
		for(bigJ = 0; bigJ <= size; bigJ++) {//右边界
			if(array[0][bigJ]  == target) {
				return true;
			} else if(array[0][bigJ] > target){
				break;
			}
		}
		--bigJ;
		
		for(bigI = 0; bigI <= rows; bigI++) {//下边界
			if(array[bigI][bigJ] == target) {
				return true;
			} else if(array[bigI][bigJ] > target) {
				break;
			}
		}
		bigI = bigI > rows ? rows : bigI;
		
		int smallI,smallJ;//最小临界点坐标
		for(smallJ = bigJ; smallJ >= 0; smallJ--) {//左边界
			if(array[bigI][smallJ] == target) {
				return true;
			} else if(array[bigI][smallJ] < target) {
				break;
			}
		}
		++smallJ;
		
		for(smallI = bigI; smallI >= 0; smallI--) {//上边界
			if(array[smallI][smallJ] == target) {
				return true;
			} else if(array[smallI][smallJ] < target) {
				break;
			}
		}
		
		//遍历判断两个临界点范围内的数是否有target
		for(int i = smallI; i <= bigI; i++) {
			for(int j = smallJ; j <= bigJ; j++) {
				if(array[i][j] == target) {
					return true;
				}
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