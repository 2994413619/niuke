package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����4:11:38
 * @Description ͨ����100%
 *
 */
public class A09��̬��̨�� {
	
	public static void main(String[] args) {
		//����
		System.out.println(JumpFloorII(5));
	}

	 public static int JumpFloorII(int target) {
	      if(target == 1) {
	    	  return 1;
	      }
	      
	      int[] arra = new int[target];
	      arra[0] = 1;
	      for(int i = 1; i < target; i++) {
	    	  arra[i] = addAll(arra,i) + 1;
	      }
	      
	      return arra[target - 1];
	 }
	 
	 //����ĺ�
	 public static int addAll(int[] array,int n) {
		 int number = 0;
		 for(int i = 0; i < n; i++) {
			 number += array[i];
		 }
		 return number;
	 }
	
}
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 */
