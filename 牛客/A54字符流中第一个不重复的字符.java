package ţ��;

import java.util.LinkedList;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��11��3�� ����12:22:31
 * @Description ac:100%
 *
 */
public class A54�ַ����е�һ�����ظ����ַ� {
	
	LinkedList<Character> noRepeat = new LinkedList<Character>();
	LinkedList<Character> Repeat = new LinkedList<Character>();

	// Insert one char from stringstream
	public void Insert(char ch) {
		if(!noRepeat.contains(ch) && !Repeat.contains(ch)) {
			noRepeat.add(ch);
		} else if(noRepeat.contains(ch)) {
			noRepeat.remove((Object)ch);
			Repeat.add(ch);
		}
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		if(noRepeat.size() == 0) {
			return '#';
		}
		return noRepeat.get(0);
	}
	
	@Test
	public void test() {
		A54�ַ����е�һ�����ظ����ַ� aa = new A54�ַ����е�һ�����ظ����ַ�();
		aa.Insert('g');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('o');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('o');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('g');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('l');
		System.out.print(aa.FirstAppearingOnce());
		aa.Insert('e');
		System.out.print(aa.FirstAppearingOnce());
	}

}
/**
 * ��Ŀ����
��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
�������:
�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
*/
