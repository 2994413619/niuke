package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午4:27:24
 * @Description 通过：100%
 *
 */
public class A10矩形覆盖 {
	
	public static void main(String[] args) {
		//测试
		System.out.println(RectCover(3));
	}

	public static int RectCover(int target) {
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
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
*/