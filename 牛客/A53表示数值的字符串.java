package ţ��;

import java.util.regex.Pattern;

/**
 * 
 * @author ����
 * @date 2019��11��3�� ����12:00:26
 * @Description ac:100%
 *
 */
public class A53��ʾ��ֵ���ַ��� {

	public boolean isNumeric(char[] str) {
		return Pattern.matches("[\\-+]?\\d*(\\.\\d+)?([eE][\\-+]?\\d+)?", new String(str));
	}

}
/**
��Ŀ����
��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С���������磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ�� ����"12e",
"1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
*/