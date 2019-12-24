package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年12月9日 下午10:42:50
 * @Description ac：100%
 *
 */
public class A57二叉树的下一个结点 {

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		
		//1、如果二叉树为null
		if(pNode == null) {
			return null;
		}
		
		//2、如果有右子树，返回右子树的最左节点
		if(pNode.right != null) {
			TreeLinkNode node = pNode.right;
			while(node.left != null) {
				node = node.left;
			}
			return node;
		}
		
		//3、如果没有右子树，但有父节点
		if(pNode.next != null) {
			//3.1是父节点的左子节点:直接返回父节点
			if(pNode.next.left == pNode) {
				return pNode.next;
			}
			
			//3.2是父节点的右子节点：返回是左节点的父节点
			TreeLinkNode node = pNode.next;
			while(node.next != null) {//父节点不是根节点
				if(node.next.left == node) {//如果父节点是左节点，返回父节点的父节点
					return node.next;
				} else {//父节点是右节点，向上继续找
					node = node.next;
				}
			}
		}
		
		//4、如果没有右子树也没有父节点，或没有作为左子树的祖先节点
		return null;
		
	}

}
/**
 * 题目描述 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */