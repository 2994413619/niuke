package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����3:34:31
 * @Description ͨ����100%
 *
 */
public class A08��̨�� {
	
	public static void main(String[] args) {
		//����
		System.out.println(JumpFloor(5));
	}

	 public static int JumpFloor(int target) {

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
һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
*/