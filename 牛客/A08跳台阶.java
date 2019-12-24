package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午3:34:31
 * @Description 通过：100%
 *
 */
public class A08跳台阶 {
	
	public static void main(String[] args) {
		//测试
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
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
*/