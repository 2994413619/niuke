package ţ��;

import java.util.ArrayList;

/**
 * 
 * @author ����
 * @date 2019��9��12�� ����1:23:35
 * @Description ac:100%
 *
 */
public class A36��������ĵ�һ��������� {

	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		
		ListNode result = null;
		
		ListNode node = pHead1;
		ArrayList<ListNode> list1 = new ArrayList<ListNode>();
		ArrayList<ListNode> list2 = new ArrayList<ListNode>();
		while(node != null) {
			list1.add(node);
			node = node.next;
		}
		
		node = pHead2;
		while(node != null) {
			list2.add(node);
			node = node.next;
		}
		
		loop:for(ListNode i: list1) {
			for(ListNode j: list2) {
				if(i == j) {
					result = i;
					break loop;
				}
			}
		}
		
		
		return result;
    }
	
}
/**
��Ŀ����
�������������ҳ����ǵĵ�һ��������㡣
*/