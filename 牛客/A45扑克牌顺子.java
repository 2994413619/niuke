package ţ��;

import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @author ����
 * @date 2019��10��23�� ����11:44:11
 * @Description ac:100%
 *
 */
public class A45�˿���˳�� {

	public boolean isContinuous(int [] numbers) {
		
		//��û��5��
		if(numbers.length < 5) {
			return false;
		}
		
		Arrays.sort(numbers);
		int count = 0;//��¼����С��������
		for(int i = 0; i < numbers.length - 1; i++) {
			if(numbers[i] == 0) {//���Ǵ�С��
				count++;
			} else {//�Ʋ��Ǵ�С��
				if(numbers[i] + 1 != numbers[i + 1]) {//��i�ź͵�i+1�����Ʋ�����
					
					//������ڶ���
					if(numbers[i]== numbers[i + 1]) {
						return false;
					}
					
					if(count > 0) {//���ڴ�С��
						numbers[0] = numbers[i] + 1;//�Ѵ�С����Ϊ����
						Arrays.sort(numbers);//��������
						i--;
						count--;
					} else {
						return false;
					}
					
				}
			}
		}
		return true;
    }
	
	@Test
	public void test() {
		int[] array = {1,0,0,5,0};
		System.out.println(isContinuous(array));
	}
}
/**
��Ŀ����
LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...��������г����5����,�����Լ�������,
�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,
��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),
��So Lucky!����LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ� ����������˳�Ӿ����true��
��������false��Ϊ�˷������,�������Ϊ��С����0��
*/