package ţ��;

/**
 * 
 * @author ����
 * @date 2019��12��9�� ����11:43:14
 * @Description ac:100%
 * ˼·:
 * 		1���ж����������ڵ�ֵ�Ƿ���ȣ�����ȣ�����false
 * 		2�����������ڵ���ȣ��ݹ��ж���������������������������������ֵ�Ƿ���ȣ��Լ��������������������������������Ƿ���ȡ�
 */
public class A58�ԳƵĶ�����2 {
	
	boolean isSymmetrical(TreeNode pRoot) {
		if(pRoot == null) {
			return true;
		}
		
		return judge(pRoot.left,pRoot.right);
		
	}
	
	//�ж��������Ƿ�Գ�
	boolean judge(TreeNode left, TreeNode right) {
		if(left == null && right == null) {
			return true;
		} else if(left != null && right != null) {
			if(left.val == right.val) {
				return judge(left.right, right.left) && judge(left.left, right.right);
			}
		}
		return false;
	}

}
