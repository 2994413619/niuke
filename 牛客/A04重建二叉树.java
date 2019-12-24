package 牛客;

import java.util.Arrays;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午2:33:40
 * @Description 通过100%
 *
 */
public class A04重建二叉树 {
	
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode treeNode = reConstructBinaryTree(pre,in);
		System.out.println(treeNode.val);
	}
	

	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //判断数组是否为空
		if(pre.length == 0) {
			return null;
		}
		
		//1、获得第一个根节点
		TreeNode root = new TreeNode(pre[0]);
		
		//2、根据第一个节点把pre、in分成左右子树
		//---寻找中序遍历中root的位置
		int index;
		for(index = 0; index < in.length; index++) {
			if(pre[0] == in[index]) {
				break;
			}
		}
		
		//---分裂数组，找出左右子树的前序、中序遍历
		int[] childInLeft = Arrays.copyOfRange(in, 0, index);
		int[] childPreLeft = Arrays.copyOfRange(pre, 1, 1 + childInLeft.length);
		
		int[] childInRight = Arrays.copyOfRange(in, index + 1, in.length);
		int[] childPreRight = Arrays.copyOfRange(pre, 1 + childInLeft.length, pre.length);
		
		//3、为更节点添加左右子树
		addTree(root, childPreLeft, childInLeft, 1);
		addTree(root, childPreRight, childInRight, 0);
		
		
		return root;
    }
	
	
	//为节点添加左右子树:flag = 1表示左节点，0表示右节点
	public static void addTree(TreeNode node, int[] pre, int[] in, int flag) {
		//跳出递归：pre或in长度为0
		if(pre.length == 0 || in.length == 0) {
			return ;
		}
		
		//为node添加左右节点
		TreeNode childNode =new TreeNode(pre[0]);
		if(flag == 1) {
			node.left = childNode;
		} else {
			node.right = childNode;
		}
		
		//递归为node的子节点添加子节点
		//2、根据第一个节点把pre、in分成左右子树
		//---寻找中序遍历中root的位置
		int index;
		for(index = 0; index < in.length; index++) {
			if(pre[0] == in[index]) {
				break;
			}
		}
		
		//---分裂数组，找出左右子树的前序、中序遍历
		int[] childInLeft = Arrays.copyOfRange(in, 0, index);
		int[] childPreLeft = Arrays.copyOfRange(pre, 1, 1 + childInLeft.length);
		
		int[] childInRight = Arrays.copyOfRange(in, index + 1, in.length);
		int[] childPreRight = Arrays.copyOfRange(pre, 1 + childInLeft.length, pre.length);
		
		//3、为更节点添加左右子树
		addTree(childNode, childPreLeft, childInLeft, 1);
		addTree(childNode, childPreRight, childInRight, 0);
	}
	
}

/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/