package ţ��;

/**
 * 
 * @author ����
 * @date 2019��11��3�� ����12:13:10
 * @Description ac:100%
 *
 */
public class A51�����˻����� {

	public int[] multiply(int[] A) {
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			B[i] = 1;
			for(int j = 0; j < A.length; j++) {
				if(j != i) {
					B[i] *= A[j];
				}
			}
		}
		
		return B;
    }
	
}
/**
��Ŀ����
����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
*/