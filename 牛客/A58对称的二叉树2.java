package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年12月9日 下午11:43:14
 * @Description ac:100%
 * 思路:
 * 		1、判断左右子树节点值是否相等，不相等，返回false
 * 		2、左右子树节点相等，递归判断左子树的左子树和右子树的右子树的值是否相等，以及左子树的右子树和右子树的左子树是否相等。
 */
public class A58对称的二叉树2 {
	
	boolean isSymmetrical(TreeNode pRoot) {
		if(pRoot == null) {
			return true;
		}
		
		return judge(pRoot.left,pRoot.right);
		
	}
	
	//判断两棵树是否对称
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
