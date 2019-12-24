package ţ��;

/**
 * 
 * @author ����
 * @date 2019��9��12�� ����2:08:56
 * @Description ac:100%
 *
 */
public class A39ƽ������� {

	private boolean flag = true;
	
	public boolean IsBalanced_Solution(TreeNode root) {
		dlr(root);
		return flag;
	}

	public int dlr(TreeNode node) {
		if(flag) {
			if(node == null) {
				return 0;
			} else {
				int left = dlr(node.left);
				int right = dlr(node.right);
				
				if(left == -1 || right == -1) {
					return -1;
				}
				
				if(Math.abs(left - right) > 1) {
					flag = false;
				}
				
				return Math.max(left, right) + 1;
			}
		}
		
		return -1;
	}
	
}
