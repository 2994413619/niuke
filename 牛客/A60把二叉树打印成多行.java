package 牛客;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author 喻超
 * @date 2019年12月10日 下午10:47:33
 * @Description ac:100%
 *
 */
public class A60把二叉树打印成多行 {

	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	    
	    if(pRoot == null) {
	    	return list;
	    }
	    
	    LinkedList<TreeNode> sublist1 = new LinkedList<TreeNode>();
	    LinkedList<TreeNode> sublist2 = new LinkedList<TreeNode>();
	    
	    sublist1.offer(pRoot);
	    
	    while(sublist1.size() != 0 || sublist2.size() != 0) {
	    	if(sublist1.size() != 0) {
	    		ArrayList<Integer> list2 = new ArrayList<Integer>();
	    		while(sublist1.size() != 0) {
	    			TreeNode node = sublist1.remove();
	    			list2.add(node.val);
	    			if(node.left != null) {
	    				sublist2.offer(node.left);
	    			}
	    			if(node.right != null) {
	    				sublist2.offer(node.right);
	    			}
	    		}
	    		list.add(list2);
	    	}
	    	
	    	if(sublist2.size() != 0) {
	    		ArrayList<Integer> list2 = new ArrayList<Integer>();
	    		while(sublist2.size() != 0) {
	    			TreeNode node = sublist2.remove();
	    			list2.add(node.val);
	    			if(node.left != null) {
	    				sublist1.offer(node.left);
	    			}
	    			if(node.right != null) {
	    				sublist1.offer(node.right);
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
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
*/