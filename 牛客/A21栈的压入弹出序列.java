package ţ��;

import java.util.Stack;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����5:56:51
 * @Description ac:100%
 *
 */
public class A21ջ��ѹ�뵯������ {
	
	//����
	public static void main(String[] args) {
		int [] pushA = {1,2,3,4,5};
		//int [] popA = {4,5,3,2,1};
		int [] popA = {4,3,5,1,2};
		System.out.println(IsPopOrder(pushA, popA));
	}

	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stackPre = new Stack<Integer>();
		Stack<Integer> stackNext = new Stack<Integer>();
		
		int index = -1;
		for(int i = 0; i < pushA.length; i++) {
			if(popA[0] == pushA[i]) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {//������Ϊ[1][2]��ʱ��
			return false;
		}
		
		for(int i = 0; i < index; i++) {
			stackPre.push(pushA[i]);
		}
		
		for(int i = index + 1; i < pushA.length; i++) {
			stackNext.push(pushA[i]);
		}
		
		Integer temp1 = null,temp2 = null;
		for(int i = 1; i < popA.length; i++) {
			if(!stackPre.empty()) {
				temp1 = stackPre.pop();
			}
			
			if(!stackNext.empty()) {
				temp2 = stackNext.pop();
			}
			
			if(popA[i] == temp1) {
				stackNext.push(temp2);
			} else if(popA[i] == temp2) {
				stackPre.push(temp1);
			} else {
				return false;
			}
		}
		
		return true;
    }
	
}
/**
��Ŀ����
���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
*/