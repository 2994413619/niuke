package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����2:35:40
 * @Description ac:100%
 *
 */
public class A18�������ľ��� {
	
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
�������ľ����壺Դ������ 
   8
  /  \
 6   10
/ \  / \
5  7 9 11
���������
   8
  /  \
10   6
/ \  / \
11 9 7  5
*/