package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年9月11日 上午10:29:19
 * @Description 运行超时
 *
 */
public class A33丑数 {

	public int GetUglyNumber_Solution(int index) {
		int i = 0;
        int n = 1,temp;
        while(true) {
             
            temp = n;
             
            while(true) {
                if(temp % 2 == 0) {
                    temp /= 2;
                } else if(temp % 3 == 0) {
                    temp /= 3;
                } else if(temp % 5 == 0) {
                    temp /= 5;
                } else {
                    if(temp == 1) {
                        i++;
                    }
                    break;
                }
            }
             
             
            if(i == index) {
                break;
            }
             
            n++;
        }
         
        return n;
    }
	
	public static void main(String[] args) {
		A33丑数 test = new A33丑数();
		int n = test.GetUglyNumber_Solution(1000000);
		System.out.println(n);
	}
	
}
/**
题目描述
把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。

丑数
1		
2	1*2	
3		1*3
4	2*2
5			1*5
6		2*3
8	4*2
9		3*3
10	5*2
12	6*2
15		5*3
16	8*2
18	9*2
*/