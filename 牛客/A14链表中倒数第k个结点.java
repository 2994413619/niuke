package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����3:10:15
 * @Description ac:100%
 *
 */
public class A14�����е�����k����� {
	
    public ListNode FindKthToTail(ListNode head,int k) {
    	
    	if(head == null) {
    		return null;
    	}
    	
    	//����������
    	int size = 1;
    	ListNode node = head;
    	while(node.next != null) {
    		node = node.next;
    		size++;
    	}
    	
    	if(k > size) {
    		return null;
    	}
    	
    	//���������k��Ԫ��
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
/*��Ŀ������
 * ����һ����������������е�����k����㡣
 */
 