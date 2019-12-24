package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年9月12日 下午1:30:55
 * @Description ac:100%
 *
 */
public class A38二叉树的深度 {

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
题目描述
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
*/