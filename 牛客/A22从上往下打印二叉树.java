package 牛客;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 下午6:13:54
 * @Description ac:100%
 *
 */
public class A22从上往下打印二叉树 {

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root == null) {
			return list;
		}
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	//取出首节点放入list中
        	TreeNode node = queue.remove();
        	list.add(node.val);
        	if(node.left != null) {
        		queue.add(node.left);
        	}
        	if(node.right != null) {
        		queue.add(node.right);
        	}
        }
        
        return list;
    }
	
}
/*
题目描述
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
*/