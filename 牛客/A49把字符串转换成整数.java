package ţ��;

import java.util.regex.Pattern;

/**
 * 
 * @author ����
 * @date 2019��11��2�� ����11:15:09
 * @Description ac:100%
 *
 */
public class A49���ַ���ת�������� {

	public int StrToInt(String str) {
		long result = 0;
		//1.�ַ������ϸ�ʽ������ת��;С����[0-9\\-+]\\d+(.?\\d+)?
		if(Pattern.matches("[0-9\\-+]\\d+", str)) {
			//1.1����Ǹ���
			if(str.charAt(0) == '-') {
				//1.1.1ȥ������
				str = str.substring(1);
				//1.1.2ת��Ϊ����
				int length = str.length();
				for(int i = 0; i < str.length(); i++) {
					result -= ((str.charAt(i) - '0') * Math.pow(10, --length));
				}
				//1.1.3�ж��Ƿ񳬳����͵����ַ�Χ
				if(result < Integer.MIN_VALUE) {
					result = 0;
				}
			} else {//1.2���������
				//1.2.1ȥ���Ӻ�
				if(str.charAt(0) == '+') {
					str = str.substring(1);
				}
				//1.2.2ת��Ϊ����
				int length = str.length();
				for(int i = 0; i < str.length(); i++) {
					result += (str.charAt(i) - '0') * Math.pow(10, --length);
				}
				//1.2.3�ж��Ƿ񳬳����͵����ַ�Χ
				if(result > Integer.MAX_VALUE) {
					result = 0;
				}
			}
			
		}
		
		return (int) result;
		
	}
	
	@org.junit.Test
	public void test() {
		System.out.println(StrToInt("-2147483648"));
	}

}
/**
 * ��Ŀ���� ��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0 ��������:
 * ����һ���ַ���,����������ĸ����,����Ϊ�� �������: ����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0 ʾ��1 ���� ���� +2147483647 1a33
 * ��� ���� 2147483647 0
 */