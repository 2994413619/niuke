package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 下午2:35:40
 * @Description ac:100%
 *
 */
public class A18二叉树的镜像 {
	
	public void Mirror(TreeNode root) {
        if(root == null) {
        	return ;
        }
        
        if(root.left == null && root.right == null) {
        	return ;
        }
        
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        Mirror(root.left);
        Mirror(root.right);
        
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
二叉树的镜像定义：源二叉树 
   8
  /  \
 6   10
/ \  / \
5  7 9 11
镜像二叉树
   8
  /  \
10   6
/ \  / \
11 9 7  5
*/