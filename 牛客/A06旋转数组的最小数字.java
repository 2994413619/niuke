package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����3:19:13
 * @Description ͨ����100%
 *
 */
public class A06��ת�������С���� {
	
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
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
*/