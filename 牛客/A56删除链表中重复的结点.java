package ţ��;

import java.util.HashSet;

/**
 * 
 * @author ����
 * @date 2019��12��9�� ����9:50:46
 * @Description ac:100%
 *
 */
public class A56ɾ���������ظ��Ľ�� {

	public ListNode deleteDuplication(ListNode pHead) {
		
		if(pHead == null) {
			return null;
		}
		
		//��һ��������ҳ�Ҫɾ���Ľڵ�ֵ�ļ���
		HashSet<Integer> set = new HashSet<Integer>();//�洢ֻ���ֹ�һ�ε�ֵ
		HashSet<Object> set2 = new HashSet<>();//�洢�ظ�����ֵ
		
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
		
		
		//�ڶ��������ɾ���ظ��Ľڵ�
		node = pHead;
		ListNode pre = null;
		
		ListNode resultHead = node;//���������ͷ���
		
		while(node != null) {
			
			//ɾ���ظ��ڵ�
			if(set2.contains(node.val)) {
				if(pre == null) {//ɾ��ͷ���
					node = node.next;
					resultHead = node;
				} else {//ɾ����ͷ�ڵ�
					pre.next = node.next;
					node = node.next;
				}
			} else {
				//ָ������ƶ�
				pre = node;
				node = node.next;
			}
			
		}
		
		return resultHead;
		
	}

}
/**
 * ��Ŀ���� ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
 * ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 */