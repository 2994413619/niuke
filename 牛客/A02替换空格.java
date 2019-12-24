package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午1:43:32
 * @Description 通过100%
 *
 */
public class A02替换空格 {

	public static void main(String[] args) {
		//测试
		System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
	}
	
	public static String replaceSpace(StringBuffer str) {
		String string = str.toString();
		return string.replaceAll(" ", "%20");
    }
	
}
/*

请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/