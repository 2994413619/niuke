package ţ��;

/**
 * 
 * @author ����
 * @date 2019��9��9�� ����6:46:31
 * @Description ac:100%
 *
 */
public class A31������1���ֵĴ��� {
	public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
         
        for(int i = 1; i <= n; i++) {
            String string = (i + "").replaceAll("0|[2-9]", "");
            count += string.length();
        }
        return count;
    }
}