package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 下午1:57:51
 * @Description ac:100%
 *
 */
public class A16合并两个排序的链表 {
	//测试
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(9);
		ListNode node5 = new ListNode(11);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode node11 = new ListNode(2);
		ListNode node12 = new ListNode(5);
		ListNode node13 = new ListNode(8);
		ListNode node14 = new ListNode(13);
		ListNode node15 = new ListNode(20);
		node11.next = node12;
		node12.next = node13;
		node13.next = node14;
		node14.next = node15;
		
		ListNode merge = Merge(node1,node11);
		
		System.out.println(merge);
		
	}
	
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) {
        	return list2;
        }
        if(list2 == null) {
        	return list1;
        }
        
        //遍历链表list1，一个一个插入到list2中
        ListNode pre = list2,next = list2.next,node = list1,head = list2,temp;
        while(node != null) {
        	if(next != null) {
        		if(node.val < pre.val) {//一开始list2头结点小于list1头结点
	        		head = list1;
	        		temp = node.next;
	        		node.next = pre;
	        		
	        		next = pre;
	        		pre = node;
	        		node = temp;
	        		
	        	} else if(node.val >=pre.val && node.val <=next.val) {
	        		pre.next = node;
	        		temp = node.next;
	        		node.next = next;
	        		
	        		pre = node;
	        		node = temp;
	        	} else {
	        		pre = next;
	        		next = next.next;
	        	}
        	} else {
        		if(node.val >= pre.val) {
        			pre.next = node;
        			break;
        		} else {
        			//只有一开始有可能进入这里
        			head = list1;
        			temp = node.next;
        			node.next = pre;
        			next = pre;
        			pre = node;
        			
        			node = temp;
        		}
        	}
        }
        
        return head;
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
 * 题目描述
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
*/

