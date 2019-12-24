package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 上午1:55:32
 * @Description ac：100%
 *
 */
public class A32把数组排成最小的数 {

	public static void main(String[] args) {
		System.out.println(PrintMinNumber(new int[]{3,32,321}));
		
	}
	
	public static String PrintMinNumber(int [] numbers) {
		int temp;
		int index;
		for(int i = numbers.length - 1; i >= 0 ; i--) {
			index = 0;
			for(int j = 1; j <= i; j++) {
				if(comp(numbers[j],numbers[index])) {
					//numbers[j]大
					index = j;
				}
			}
			
			temp = numbers[index];
			numbers[index] = numbers[i];
			numbers[i] = temp;
			
		}
		
		String string = "";
		for(int i = 0; i < numbers.length; i++) {
			string += numbers[i];
		}
		
		return string;
    }
	
	//a是否“大于”b，是返回true
	public static boolean comp(int i1,int i2) {
		String a = i1 + "";
		String b = i2 + "";
		
		long f1 = Long.parseLong(a + b);
		long f2 = Long.parseLong(b + a);
		if(f1 > f2) {
			return true;
		}
		return false;
	}
	
}
