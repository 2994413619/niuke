package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午4:11:38
 * @Description 通过：100%
 *
 */
public class A09变态跳台阶 {
	
	public static void main(String[] args) {
		//测试
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
	 
	 //数组的和
	 public static int addAll(int[] array,int n) {
		 int number = 0;
		 for(int i = 0; i < n; i++) {
			 number += array[i];
		 }
		 return number;
	 }
	
}
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
