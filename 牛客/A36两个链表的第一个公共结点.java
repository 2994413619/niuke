package 牛客;

import java.util.ArrayList;

/**
 * 
 * @author 喻超
 * @date 2019年9月12日 下午1:23:35
 * @Description ac:100%
 *
 */
public class A36两个链表的第一个公共结点 {

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
题目描述
输入两个链表，找出它们的第一个公共结点。
*/