package ţ��;

import java.util.HashSet;

/**
 * 
 * @author ����
 * @date 2019��11��3�� ����12:45:26
 * @Description ac:100%
 *
 */
public class A55�����л�����ڽ�� {

	public ListNode EntryNodeOfLoop(ListNode pHead) {
		
		if(pHead == null) {
			return null;
		}
		
		HashSet<ListNode> set = new HashSet<ListNode>();
		set.add(pHead);
		ListNode node = pHead.next;
		while(node != null) {
			if(!set.contains(node)) {
				set.add(node);
			} else {
				return node;
			}
			node = node.next;
		}
		return null;
	}

}
/**
 * ��Ŀ���� ��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
 */