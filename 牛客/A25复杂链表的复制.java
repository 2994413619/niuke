package ţ��;

import java.util.ArrayList;

/**
 * 
 * @author ����
 * @date 2019��9��7�� ����2:50:59
 * @Description ac:100%
 *
 */
public class A25��������ĸ��� {

	public RandomListNode Clone(RandomListNode pHead) {
		
		RandomListNode head = null,node = null,pNode = pHead;
		
		//����ĳ���
		int count = 0;
		//��¼ԭ����ÿ���ڵ�����ָ���ָ��
		ArrayList<RandomListNode> list = new ArrayList<RandomListNode>();

		//1����������(����ָ����ʱû��ָ��)����¼������,��¼ԭ����ÿ���ڵ������ָ��
		while(pNode != null) {
			if(head == null) {
				head = new RandomListNode(pNode.label);
				node = head;
			} else {
				node.next = new RandomListNode(pNode.label);
				node = node.next;
			}
			
			list.add(pNode.random);
			pNode = pNode.next;
			count++;
		}
		
		//2����¼ÿ���ڵ��ָ�����ָ��ڼ���Ԫ�أ���0��ʼ������
		int[] temp = new int[count];
		int index = 0, n;
		for (RandomListNode listNode : list) {
			pNode = pHead;
			n = 0;
			while(pNode != null) {
				if(listNode == pNode) {
					break;
				}
				pNode = pNode.next;
				n++;
			}
			
			if(n == count) {
				n = -1;
			}
			temp[index++] = n;
		}
		
		//3��Ϊ���Ƶ������������ָ��
		node = head;
		index = 0;
		while(node != null) {
			
			pNode = head;
			n = 0;
			while(pNode != null) {
				if(temp[index] == n++) {
					node.random = pNode;
					break;
				}
				pNode = pNode.next;
			}
			index++;
			
			node = node.next;
		}
		
		
		return head;
	}
	
	//����
	public static void main(String[] args) {
		RandomListNode r1 = new RandomListNode(1);
		RandomListNode r2 = new RandomListNode(2);
		RandomListNode r3 = new RandomListNode(3);
		RandomListNode r4 = new RandomListNode(4);
		RandomListNode r5 = new RandomListNode(5);
		
		r1.next = r2;
		r2.next = r3;
		r3.next = r4;
		r4.next = r5;
		r1.random = r3;
		r2.random = r5;
		r4.random = r2;
		
		A25��������ĸ��� test = new A25��������ĸ���();
		RandomListNode clone = test.Clone(r1);
		System.out.println(clone);
	}

}
/**
 * ��Ŀ���� ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 */