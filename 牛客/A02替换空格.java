package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����1:43:32
 * @Description ͨ��100%
 *
 */
public class A02�滻�ո� {

	public static void main(String[] args) {
		//����
		System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
	}
	
	public static String replaceSpace(StringBuffer str) {
		String string = str.toString();
		return string.replaceAll(" ", "%20");
    }
	
}
/*

��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
*/