package ţ��;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����2:29:02
 * @Description ac��100%
 *
 */
public class A17�����ӽṹ {
	
	private TreeNode b;
	private Boolean flag = false;//false��ʾB����A��������true��ʾ��

	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2 == null || root1 == null) {
        	return false;
        }
        b = root2;
        Dlr(root1);
        return flag;
    }
	
	//���������A,Ѱ�ҶԱ����
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
	
	//���������A,Ѱ�ҶԱ����
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
��Ŀ����
�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
*/