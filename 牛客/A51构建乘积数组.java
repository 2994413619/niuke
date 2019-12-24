package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年11月3日 上午12:13:10
 * @Description ac:100%
 *
 */
public class A51构建乘积数组 {

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
题目描述
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
*/