package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����1:55:32
 * @Description ac��100%
 *
 */
public class A32�������ų���С���� {

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
					//numbers[j]��
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
	
	//a�Ƿ񡰴��ڡ�b���Ƿ���true
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
