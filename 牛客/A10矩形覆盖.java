package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����4:27:24
 * @Description ͨ����100%
 *
 */
public class A10���θ��� {
	
	public static void main(String[] args) {
		//����
		System.out.println(RectCover(3));
	}

	public static int RectCover(int target) {
		if(target == 1) {
			return 1;
		} else if(target == 2) {
			return 2;
		}
		
		int a = 1,b = 2,num = 0;
		 for(int i = 0; i < target - 2; i++) {
			 num = a + b;
			 a = b;
			 b = num;
		 }
		 
		 return num;
	}
	
}
/*
���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
*/