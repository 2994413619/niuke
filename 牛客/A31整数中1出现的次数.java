package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年9月9日 下午6:46:31
 * @Description ac:100%
 *
 */
public class A31整数中1出现的次数 {
	public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
         
        for(int i = 1; i <= n; i++) {
            String string = (i + "").replaceAll("0|[2-9]", "");
            count += string.length();
        }
        return count;
    }
}