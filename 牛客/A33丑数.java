package ţ��;

/**
 * 
 * @author ����
 * @date 2019��9��11�� ����10:29:19
 * @Description ���г�ʱ
 *
 */
public class A33���� {

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
		A33���� test = new A33����();
		int n = test.GetUglyNumber_Solution(1000000);
		System.out.println(n);
	}
	
}
/**
��Ŀ����
��ֻ����������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������

����
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