package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午3:34:05
 * @Description 通过：100%
 *
 */
public class A07斐波那契数列 {
	
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
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
*/