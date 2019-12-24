package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 下午2:29:02
 * @Description ac：100%
 *
 */
public class A17树的子结构 {
	
	private TreeNode b;
	private Boolean flag = false;//false表示B不是A的子树，true表示是

	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2 == null || root1 == null) {
        	return false;
        }
        b = root2;
        Dlr(root1);
        return flag;
    }
	
	//先序遍历树A,寻找对比起点
	public void Dlr(TreeNode root) {
		if(flag == true ||root == null) {
			return ;
		}
		if(root.val == b.val) {
			if(judge(root,b)) {
				flag = true;
				return ;
			}
		}
		Dlr(root.left);
		Dlr(root.right);
	}
	
	//先序遍历树A,寻找对比起点
	public boolean judge(TreeNode root1, TreeNode root2) {
		
		if((root1 == null && root2 == null) || (root1 != null && root2 == null)) {
			return true;
		} else if(root1 == null && root2 != null) {
			return false;
		}
		
		if(root1.val == root2.val) {
			if(!judge(root1.left,root2.left)) {
				return false;
			}
			if(!judge(root1.right, root2.right)) {
				return false;
			}
		} else {
			return false;
		}
		
		return true;
	}
	
}

/*class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}*/

/*
题目描述
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
*/