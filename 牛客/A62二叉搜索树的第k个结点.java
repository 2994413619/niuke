package 牛客;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author 喻超
 * @date 2019年12月11日 下午9:14:19
 * @Description ac:100%
 *
 */
public class A62二叉搜索树的第k个结点 {
	
	private List<TreeNode> list = new ArrayList<TreeNode>();

	TreeNode KthNode(TreeNode pRoot, int k) {
		
		if(k <= 0 || pRoot == null) {
			return null;
		}
		
		//遍历获得节点集合
		ldf(pRoot);
		
		//k值大于总结点数，返回null
		if(k > list.size()) {
			return null;
		}
		
		Collections.sort(list, new Comparator<TreeNode>() {

			@Override
			public int compare(TreeNode o1, TreeNode o2) {
				return o1.val - o2.val;
			}
		});
		
		return list.get(k - 1);
		
	}
	
	//遍历二叉树
	private void ldf(TreeNode node) {
		
		if(node != null) {
			list.add(node);
			
			ldf(node.left);
			ldf(node.right);
		}

	}

}
/**
 * 题目描述 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8） 中，按结点数值大小顺序第三小结点的值为4。
 */