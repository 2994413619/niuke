package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����3:34:05
 * @Description ͨ����100%
 *
 */
public class A07쳲��������� {
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(4));
	}

	public static int Fibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		}
		
		int a = 0,b = 1,num = 0;
		for(int i = 0; i < n - 1; i++) {
			num = a + b;
			a = b;
			b = num;
		}
	
		return num;
    }
	
}
/*
��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
n<=39
*/