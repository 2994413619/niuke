package ţ��;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����1:43:19
 * @Description 
 * ͨ��100%
 */
public class A03��β��ͷ��ӡ���� {
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		if(listNode == null) {
			return new ArrayList<Integer>();
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(listNode.val);
		while(listNode.next != null) {
			listNode = listNode.next;
			stack.add(listNode.val);
		}
	
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(stack.size() > 0) {
			list.add(stack.pop());
		}
		
		return list;
		
		/*//����������
		int n = 1;
		while(listNode.next != null) {
			++n;
		}
		
		//ѭ����ŵ�������
		Integer[] arra =new Integer[n];
		for(int i = 0; i < n; i++) {
			arra[i] = listNode.val;
			listNode = listNode.next;
		}
		
		//���������ArrayList��
		List<Integer> list = Arrays.asList(arra);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
		
		//����ArrayList
		Collections.reverse(arrayList);
        return arrayList;
    }*/
	
	}
}

/*class ListNode {
       int val;
       ListNode next = null;

       ListNode(int val) {
           this.val = val;
       }
}*/

/*
����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*/