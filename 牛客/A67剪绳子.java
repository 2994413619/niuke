package ţ��;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��12��16�� ����10:37:46
 * @Description ac:100%
 * 2:1*1
 * 3:1*2
 * 4:2*2
 * 5:2*3
 * 6:3*3
 */
public class A67������ {
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
��Ŀ����
����һ������Ϊn�����ӣ�������Ӽ�����������m�Σ�m��n����������n>1����m>1����ÿ�����ӵĳ��ȼ�Ϊk[0],k[1],...,k[m]������k[0]xk[1]x...xk[m]���ܵ����˻��Ƕ��٣�
���磬�����ӵĳ�����8ʱ�����ǰ������ɳ��ȷֱ�Ϊ2��3��3�����Σ���ʱ�õ������˻���18��
��������:
����һ����n����������档��2 <= n <= 60��
�������:
����𰸡�
ʾ��1
����
����
8
���
����
18
*/