package 牛客;

import org.junit.Test;

/**
 * 
 * @author 喻超
 * @date 2019年12月16日 下午10:37:46
 * @Description ac:100%
 * 2:1*1
 * 3:1*2
 * 4:2*2
 * 5:2*3
 * 6:3*3
 */
public class A67剪绳子 {
	public int cutRope(int target) {
		
		if(target == 2) {
			return 1;
		}
		
		if(target == 3) {
			return 2;
		}
		
		int x = target % 3;
		int n = target / 3;
		
		if(x == 0) {
			return (int) Math.pow(3, n);
		} else if(x == 1) {
			return (int) Math.pow(3, n - 1) * 4;
		} else {
			return (int) Math.pow(3, n) * 2;
		}
	}
	
	@Test
	public void test() {
		System.out.println(cutRope(6));
	}

}
/**
题目描述
给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
输入描述:
输入一个数n，意义见题面。（2 <= n <= 60）
输出描述:
输出答案。
示例1
输入
复制
8
输出
复制
18
*/