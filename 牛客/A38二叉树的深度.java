package ţ��;

/**
 * 
 * @author ����
 * @date 2019��9��12�� ����1:30:55
 * @Description ac:100%
 *
 */
public class A38����������� {

	private int count;
	
	public int TreeDepth(TreeNode root) {
		dlr(root,0);
		return count;
	}
	
	public void dlr(TreeNode node,int i) {
		if(node != null) {
			i++;
			dlr(node.left, i);
			dlr(node.right, i);
		} else {
			count = i > count ? i : count;
		}
	}

}
/*
��Ŀ����
����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
*/