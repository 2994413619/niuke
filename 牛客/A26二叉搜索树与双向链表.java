package ţ��;

/**
 * 
 * @author ����
 * @date 2019��9��7�� ����2:56:38
 * @Description ac��100%
 * ˼·���������
 *
 */
public class A26������������˫������ {
	
	private TreeNode head;
	private TreeNode end;

	public TreeNode Convert(TreeNode pRootOfTree) {
		
		ldr(pRootOfTree);
		
        return head;
    }
	
	//�������
	public void ldr(TreeNode node) {
		if(node == null) {
			return ;
		} else {
			//����������
			if(node.left != null) {
				ldr(node.left);
			}
			
			//����ǰ�ڵ�
			if(head == null) {
				head = node;
				end = node;
			} else {
				end.right = node;
				node.left = end;
				
				end = node;
			}
			
			//����������
			if(node.right != null) {
				ldr(node.right);
			}
		}
	}
	
}
/*
��Ŀ����
����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
*/