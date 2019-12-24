package 牛客;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午1:43:19
 * @Description 
 * 通过100%
 */
public class A03从尾到头打印链表 {
	
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
		
		/*//计算链表长度
		int n = 1;
		while(listNode.next != null) {
			++n;
		}
		
		//循环存放到数组中
		Integer[] arra =new Integer[n];
		for(int i = 0; i < n; i++) {
			arra[i] = listNode.val;
			listNode = listNode.next;
		}
		
		//把数组放入ArrayList中
		List<Integer> list = Arrays.asList(arra);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(list);
		
		//倒序ArrayList
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
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
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