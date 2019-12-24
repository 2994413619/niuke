package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����11:03:41
 * @Description 
 * ˼·�����ҵ�һ�����䣬Ȼ����������е�������Ϊ��һ�����ε������У����Ͻǵ�����С�����Ͻǵ������
 * �������ҵ�������n����С���Ͻǵ���m��Ȼ��������е���������n <targer < m
 * 
 * caseͨ����Ϊ64.71%
 *
 */
public class A01��ά�����еĲ���1 {

	public static void main(String[] args) {
		//int target = 7;
		//int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int target = 5;
		int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(Find(target, array));
	}
	
	public static boolean Find(int target, int [][] array) {
		
		int rows,size;
		
		//�ж������Ƿ�Ϊ������
		if(array.length > 0 && array[0].length > 0) {
			rows = array.length - 1;
			size = array[0].length - 1;
		} else {
			return false;
		}
		
		//�ж�Ŀ�����Ƿ�������ֵ��С����Сֵ
		if(target < array[0][0] || target > array[rows][size]){
			return false;
		}
		
		int bigI,bigJ;//����ٽ�������
		for(bigJ = 0; bigJ <= size; bigJ++) {//�ұ߽�
			if(array[0][bigJ]  == target) {
				return true;
			} else if(array[0][bigJ] > target){
				break;
			}
		}
		--bigJ;
		
		for(bigI = 0; bigI <= rows; bigI++) {//�±߽�
			if(array[bigI][bigJ] == target) {
				return true;
			} else if(array[bigI][bigJ] > target) {
				break;
			}
		}
		bigI = bigI > rows ? rows : bigI;
		
		int smallI,smallJ;//��С�ٽ������
		for(smallJ = bigJ; smallJ >= 0; smallJ--) {//��߽�
			if(array[bigI][smallJ] == target) {
				return true;
			} else if(array[bigI][smallJ] < target) {
				break;
			}
		}
		++smallJ;
		
		for(smallI = bigI; smallI >= 0; smallI--) {//�ϱ߽�
			if(array[smallI][smallJ] == target) {
				return true;
			} else if(array[smallI][smallJ] < target) {
				break;
			}
		}
		
		//�����ж������ٽ�㷶Χ�ڵ����Ƿ���target
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
��Ŀ����
��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
*/