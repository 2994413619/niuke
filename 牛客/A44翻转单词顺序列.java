package ţ��;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��10��14�� ����10:43:55
 * @Description ac:100%
 *
 */
public class A44��ת����˳���� {

	public String ReverseSentence(String str) {
		
		//����ΪʲôҪ��trim����Ҳ�е��Σ��������ۡ�������Ϊ���ù�����
		if(str == null || str.trim().equals(" ")) {
			return str;
		}
		
		String[] split = str.split(" ");
		StringBuffer result = new StringBuffer();
		for(int i = split.length - 1; i >= 0; i--) {
			if(i == split.length - 1) {
				result.append(split[i]);
			} else {
				result.append(" " + split[i]);
			}
		}
		return result.toString();
	}
	
	@Test
	public void test() {
		System.out.println(ReverseSentence(" "));
	}

}
/**
 * ��Ŀ����
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish����������
 * ��ȴ������������˼�����磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a
 * student.���� Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */