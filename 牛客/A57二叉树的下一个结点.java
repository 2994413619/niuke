package ţ��;

/**
 * 
 * @author ����
 * @date 2019��12��9�� ����10:42:50
 * @Description ac��100%
 *
 */
public class A57����������һ����� {

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		
		//1�����������Ϊnull
		if(pNode == null) {
			return null;
		}
		
		//2�������������������������������ڵ�
		if(pNode.right != null) {
			TreeLinkNode node = pNode.right;
			while(node.left != null) {
				node = node.left;
			}
			return node;
		}
		
		//3�����û�������������и��ڵ�
		if(pNode.next != null) {
			//3.1�Ǹ��ڵ�����ӽڵ�:ֱ�ӷ��ظ��ڵ�
			if(pNode.next.left == pNode) {
				return pNode.next;
			}
			
			//3.2�Ǹ��ڵ�����ӽڵ㣺��������ڵ�ĸ��ڵ�
			TreeLinkNode node = pNode.next;
			while(node.next != null) {//���ڵ㲻�Ǹ��ڵ�
				if(node.next.left == node) {//������ڵ�����ڵ㣬���ظ��ڵ�ĸ��ڵ�
					return node.next;
				} else {//���ڵ����ҽڵ㣬���ϼ�����
					node = node.next;
				}
			}
		}
		
		//4�����û��������Ҳû�и��ڵ㣬��û����Ϊ�����������Ƚڵ�
		return null;
		
	}

}
/**
 * ��Ŀ���� ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 */