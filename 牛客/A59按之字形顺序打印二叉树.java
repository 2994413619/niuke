package 牛客;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author 喻超
 * @date 2019年12月10日 下午10:25:55
 * @Description ac:100% 
 *
 */
public class A59按之字形顺序打印二叉树 {

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null) {
			return list;
		}
		
		Stack<TreeNode> left = new Stack<TreeNode>();
		Stack<TreeNode> right = new Stack<TreeNode>();
		
		
		left.push(pRoot);
		
		while(left.size() != 0 || right.size() != 0) {
			//从左向右输出的list
			if(left.size() != 0) {
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				while(left.size() != 0) {
					TreeNode node = left.pop();
					list2.add(node.val);
					if(node.left != null) {
						right.push(node.left);
					}
					if(node.right != null) {
						right.push(node.right);
					}
				}
				list.add(list2);
			}
			
			//从右向左的输出list
			if(right.size() != 0) {
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				while(right.size() != 0) {
					TreeNode node = right.pop();
					list2.add(node.val);
					if(node.right != null) {
						left.push(node.right);
					}
					if(node.left != null) {
						left.push(node.left);
					}
				}
				list.add(list2);
			}
			
			
		}
		return list;
    }
	
}
/**
题目描述
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
*/