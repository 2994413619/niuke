package 牛客;

import java.util.ArrayList;

/**
 * 
 * @author 喻超
 * @date 2019年12月9日 下午11:15:15
 * @Description ac:90%  错例：{5,5,5,5,#,#,5,5,#,5}
 * 思路：先中序遍历找出
 *
 */
public class A58对称的二叉树 {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();

	boolean isSymmetrical(TreeNode pRoot) {
		
		if(pRoot == null) {
			return true;
		}
		
		//中序遍历二叉树，将值存入list中
		ldr(pRoot);
		
		//判断list是否是对称的
		int len = list.size();
		if(len % 2 != 0) {
			for(int i = 0; i < len / 2; i++) {
				if(list.get(i) != list.get(len - 1 - i)) {
					return false;
				}
			}
		} else {
			return false;
		}
		
		return true;
		
	}
	
	//中序遍历
	private void ldr(TreeNode pRoot) {
		if(pRoot != null) {
			ldr(pRoot.left);
			list.add(pRoot.val);
			ldr(pRoot.right);
		}
	}

}
/**
题目描述
请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
*/