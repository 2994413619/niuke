package ţ��;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��9��7�� ����3:14:25
 * @Description ac:100%
 * ˼·��ȫ����
 */
public class A27�ַ��������� {

	private ArrayList<String> list = new ArrayList<String>();

	public ArrayList<String> Permutation(String str) {
		char[] array = str.toCharArray();
		
		//���ֵ�����ַ���������(ð��)
		char temp;
		for(int i = array.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
			
		}

		fullSort(array, 0);
		
		//�ѽ�������ֵ�������
		Collections.sort(list);
		return list;
	}

	// ȫ����
	public void fullSort(char[] array, int now) {
		if(now == array.length - 1) {
			String string = String.valueOf(array);
			if(!list.contains(string)) {
				list.add(string);
			}
		} else {
			char temp;
			for(int i = now; i < array.length; i++) {
				
				//����
				temp = array[i];
				array[i] = array[now];
				array[now] = temp;
				
				fullSort(array, now + 1);
				
				//����
				temp = array[i];
				array[i] = array[now];
				array[now] = temp;
			}
		}
	}
	
	//���������Ƿ�ɹ�
	@Test
	public void test() {
		ArrayList<String> permutation = Permutation("aa");
		System.out.println(permutation);
	}

}
/**
 * ��Ŀ����
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 * ��������: ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 */