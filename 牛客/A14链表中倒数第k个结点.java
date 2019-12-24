package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 上午3:10:15
 * @Description ac:100%
 *
 */
public class A14链表中倒数第k个结点 {
	
    public ListNode FindKthToTail(ListNode head,int k) {
    	
    	if(head == null) {
    		return null;
    	}
    	
    	//计算链表长度
    	int size = 1;
    	ListNode node = head;
    	while(node.next != null) {
    		node = node.next;
    		size++;
    	}
    	
    	if(k > size) {
    		return null;
    	}
    	
    	//输出倒数第k个元素
    	int n = size - k;
    	node = head;
    	for(int i = 0; i < n; i++) {
    		node = node.next;
    	}
    	
    	return node;
    }

	
}

/*class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*题目描述：
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
 