package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����3:10:37
 * @Description 
 *
 */
public class A15��ת���� {
	
	//����
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
		head.next = null;//β�ڵ��nextΪnull
		
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
��Ŀ����
����һ��������ת��������������ı�ͷ��
*/