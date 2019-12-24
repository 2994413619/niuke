package 牛客;

import java.util.HashSet;

/**
 * 
 * @author 喻超
 * @date 2019年12月9日 下午9:50:46
 * @Description ac:100%
 *
 */
public class A56删除链表中重复的结点 {

	public ListNode deleteDuplication(ListNode pHead) {
		
		if(pHead == null) {
			return null;
		}
		
		//第一遍遍历，找出要删除的节点值的集合
		HashSet<Integer> set = new HashSet<Integer>();//存储只出现过一次的值
		HashSet<Object> set2 = new HashSet<>();//存储重复的数值
		
		ListNode node = pHead;
		while(node != null) {
			
			if(!set2.contains(node.val)) {
				if(!set.contains(node.val)) {
					set.add(node.val);
				} else {
					set.remove((Object)node.val);
					set2.add(node.val);
				}
			}
			
			node  = node.next;
		}
		
		
		//第二遍遍历，删除重复的节点
		node = pHead;
		ListNode pre = null;
		
		ListNode resultHead = node;//返回链表的头结点
		
		while(node != null) {
			
			//删除重复节点
			if(set2.contains(node.val)) {
				if(pre == null) {//删除头结点
					node = node.next;
					resultHead = node;
				} else {//删除非头节点
					pre.next = node.next;
					node = node.next;
				}
			} else {
				//指针向后移动
				pre = node;
				node = node.next;
			}
			
		}
		
		return resultHead;
		
	}

}
/**
 * 题目描述 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */