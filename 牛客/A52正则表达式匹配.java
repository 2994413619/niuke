package ţ��;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��11��3�� ����12:32:43
 * @Description ac:100%
 *
 */
public class A52������ʽƥ�� {

	public boolean match(char[] str, char[] pattern){
		
		if(str.length == 0 && pattern.length == 0) {
			return true;
		}
		
		String string = new String(str);
		
		String regex = new String(pattern);
		regex = regex.replace(".", "[\\s\\S]");
		
        return Pattern.matches(regex, string);
    }
	
	@Test
	public void test() {
		match(new char[0], new char[] {'.','*'});
		
	}
	
}
/**
��Ŀ����
��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ�����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
*/