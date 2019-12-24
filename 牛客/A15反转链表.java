package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 上午3:10:37
 * @Description 
 *
 */
public class A15反转链表 {
	
	//测试
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode head = ReverseList(node1);
		System.out.println(head);
	}

	public static ListNode ReverseList(ListNode head) {
		
		if(head == null) {
			return null;
		}
		
		if(head.next == null) {
			return head;
		}
		
		ListNode pre,next,temp;
		pre = head;
		next = head.next;
		head.next = null;//尾节点的next为null
		
		while(next != null) {
			temp = next.next;
			next.next = pre;
			pre = next;
			next = temp;
		}
		return pre;
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
题目描述
输入一个链表，反转链表后，输出新链表的表头。
*/