package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����2:39:08
 * @Description ac:100%
 * ˼·���������ұ������飬��¼�������ż�����±�n�������ż����ʼ������һ���������±�m������n��m-1ȫ�������ƶ�һλ��mλ�õ�������n,���ִ�У�ֱ��ѭ������
 *
 */
public class A13��������˳��ʹ����λ��ż��ǰ�� {
	
	//����
	public static void main(String[] args) {
		int[] array = {15,48,75,15,48,79,22,69,23,15,48};
		reOrderArray(array);
		
	}

	public static void reOrderArray(int [] array) {
		int n = -1,temp;
        for(int i = 0; i < array.length; i++) {
        	if(n == -1) {
        		if(array[i] % 2 == 0) {
        			n = i;
        		}
        	} else {
        		if(array[i] % 2 == 1) {
        			temp = array[i];
        			//�����ƶ�
        			for(int j = i; j >= n + 1; j--) {
        				array[j] = array[j - 1];
        			}
        			array[n] = temp;
        			++n;
        		}
        	}
        }
    }
	
}
/*
��Ŀ����
����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
*/