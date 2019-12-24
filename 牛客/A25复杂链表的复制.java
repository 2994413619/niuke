package 牛客;

import java.util.ArrayList;

/**
 * 
 * @author 喻超
 * @date 2019年9月7日 下午2:50:59
 * @Description ac:100%
 *
 */
public class A25复杂链表的复制 {

	public RandomListNode Clone(RandomListNode pHead) {
		
		RandomListNode head = null,node = null,pNode = pHead;
		
		//链表的长度
		int count = 0;
		//记录原链表每个节点特殊指针的指向
		ArrayList<RandomListNode> list = new ArrayList<RandomListNode>();

		//1、复制链表(特殊指针暂时没有指向)，记录链表长度,记录原链表每个节点的特殊指向
		while(pNode != null) {
			if(head == null) {
				head = new RandomListNode(pNode.label);
				node = head;
			} else {
				node.next = new RandomListNode(pNode.label);
				node = node.next;
			}
			
			list.add(pNode.random);
			pNode = pNode.next;
			count++;
		}
		
		//2、记录每个节点的指向的是指向第几个元素（从0开始计数）
		int[] temp = new int[count];
		int index = 0, n;
		for (RandomListNode listNode : list) {
			pNode = pHead;
			n = 0;
			while(pNode != null) {
				if(listNode == pNode) {
					break;
				}
				pNode = pNode.next;
				n++;
			}
			
			if(n == count) {
				n = -1;
			}
			temp[index++] = n;
		}
		
		//3、为复制的链表添加特殊指向
		node = head;
		index = 0;
		while(node != null) {
			
			pNode = head;
			n = 0;
			while(pNode != null) {
				if(temp[index] == n++) {
					node.random = pNode;
					break;
				}
				pNode = pNode.next;
			}
			index++;
			
			node = node.next;
		}
		
		
		return head;
	}
	
	//测试
	public static void main(String[] args) {
		RandomListNode r1 = new RandomListNode(1);
		RandomListNode r2 = new RandomListNode(2);
		RandomListNode r3 = new RandomListNode(3);
		RandomListNode r4 = new RandomListNode(4);
		RandomListNode r5 = new RandomListNode(5);
		
		r1.next = r2;
		r2.next = r3;
		r3.next = r4;
		r4.next = r5;
		r1.random = r3;
		r2.random = r5;
		r4.random = r2;
		
		A25复杂链表的复制 test = new A25复杂链表的复制();
		RandomListNode clone = test.Clone(r1);
		System.out.println(clone);
	}

}
/**
 * 题目描述 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */