package ţ��;

/**
 * 
 * @author ����
 * @date 2019��9��12�� ����12:08:42
 * @Description ac:75% ���г�ʱ
 * �㷨���鲢����
 *
 */
public class A35�����е������ {
	
	private int count;

	public int InversePairs(int[] array) {
		
		if(array == null || array.length == 0) {
			return 0;
		}
		
		merge(array, 0, array.length - 1);
		
		return count;
		
	}
	
	//�鲢����
	public void merge(int[] array,int left, int right) {
		int size = right - left + 1;
		if(size > 1) {
			int childSize = (int) Math.ceil(size / 2.0);
			
			//����������鲢����
			merge(array, left, left + childSize - 1);
			
			//����������鲢����
			merge(array, left + childSize, right);
			
			//�ϲ�����������
			int leftPoint = left;
			int rightPoint = left + childSize;
			
			//�������������������Ը���
			for(int i = left + childSize; i <= right; i++) {
				for(int j = left; j <= left + childSize - 1; j++) {
					if(array[i] < array[j]) {
						count += left + childSize - j;
						if(count >= 1000000007) {
							count %= 1000000007;
						}
						break;
					}
				}
			}
			
			int[] temp = new int[size];//�ݴ��ź���ĺϲ�����
			for(int i = 0; i < size; i++) {//�����������������ݴ浽temp��
				
				if(leftPoint <= left + childSize - 1 && rightPoint <= right) {
					if(array[leftPoint] <= array[rightPoint]) {
						temp[i] = array[leftPoint];
						leftPoint++;
					} else {
						temp[i] = array[rightPoint];
						rightPoint++;
					}
				} else if(rightPoint <= right) {
					temp[i] = array[rightPoint++];
				} else if(leftPoint <= left + childSize - 1) {
					temp[i] = array[leftPoint++];
				}
				
			}
			
			//�ź�����������ԭ������δ���������
			for(int i = 0; i < size; i++) {
				array[left + i] = temp[i];
			}
				
		}
	}
	
	public static void main(String[] args) {
		A35�����е������ test = new A35�����е������();
		//int[] array = {1,2,3,4,5,6,7,0};
		int[] array = {1,5,748,7,54,54,87,54,54,51,57,877,684,65,4,57,8,456,4,56,7,561,564,87,56,4,564,87,54,65,111,433,1345343123,11234,12534,65234,5112,341,234,1,235,5,324,6,45,64,7,4567,58,678,7,67,234,345,6234,2,34};
		System.out.println(test.InversePairs(array));
	}

}
/*
��Ŀ����
�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
*/