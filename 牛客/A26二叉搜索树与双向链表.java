package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年9月7日 下午2:56:38
 * @Description ac：100%
 * 思路：中序遍历
 *
 */
public class A26二叉搜索树与双向链表 {
	
	private TreeNode head;
	private TreeNode end;

	public TreeNode Convert(TreeNode pRootOfTree) {
		
		ldr(pRootOfTree);
		
        return head;
    }
	
	//中序遍历
	public void ldr(TreeNode node) {
		if(node == null) {
			return ;
		} else {
			//遍历左子树
			if(node.left != null) {
				ldr(node.left);
			}
			
			//处理当前节点
			if(head == null) {
				head = node;
				end = node;
			} else {
				end.right = node;
				node.left = end;
				
				end = node;
			}
			
			//遍历右子树
			if(node.right != null) {
				ldr(node.right);
			}
		}
	}
	
}
/*
题目描述
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
*/