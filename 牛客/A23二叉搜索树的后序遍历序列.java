package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����7:18:36
 * @Description ac:100%
 * ˼·���������һ�������Ƕ������ĸ��ڵ㡣ʣ�µ������Է�Ϊ���������
 * 1��ȫС�����һ���������ڵ��������
 * 2��ȫ�������һ���������ڵ��������
 * 3��ǰ��һ����С�ڸ��ڵ㣬��һ���ִ��ڸ��ڵ�
 * 
 * ��������������϶����������������������
 */
public class A23�����������ĺ���������� {

	public static boolean VerifySquenceOfBST(int [] sequence) {
		
		if(sequence.length <= 0){
            return  false;
        }
		
        return judge(sequence, 0, sequence.length - 1);
    }
	
	//�ж�
	public static Boolean judge(int[] array, int start, int end) {
		if(end - start + 1 > 2) {//����С�ڵ���ֱ�ӷ���true��
			int flag;//1:��ʾ��һ�������ڸ��ڵ㣻0:��ʾ��һ����С�ڸ��ڵ�
			if(array[start] > array[end]) {
				flag = 1;
			} else {
				flag = 0;
			}
			
			if(flag == 1) {//ֻ��������
				for(int i = start + 1; i < end; i++) {
					if(array[i] < array[end]) {
						return false;
					}
				}
				return judge(array,start,end - 1);//�ݹ��ж�����
			} else {//��������
				int index = start;//���������ڵ�����
				int x = 0;//0:������Ϊ��������1����������������
				for(int i = start + 1; i < end; i++) {
					if(x == 0) {
						if(array[i] > array[end]) {
							x = 1;
						} else {
							index = i;
						}
					} else {
						if(array[i] < array[end]) {
							return false;
						}
					}
				}
				
				return judge(array, start, index) && judge(array, index + 1, end - 1);
				
			}
			
		}
		return true;
	}
	
	//����
	public static void main(String[] args) {
		int[] array = {7,4,6,5};
		System.out.println(VerifySquenceOfBST(array));
	}
	
}
/*
��Ŀ����
����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
*/