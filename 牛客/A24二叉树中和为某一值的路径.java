package 牛客;

import java.util.ArrayList;

/**
 * 
 * @author 喻超
 * @date 2019年9月7日 下午1:49:17
 * @Description ac:100%
 *
 */
public class A24二叉树中和为某一值的路径 {

	private ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
	private int target;

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		
		if(root == null) {
			return list;
		}
		
		this.target = target;
		bianli(root,new ArrayList<Integer>());
		return list;
	}
	
	
	public void bianli(TreeNode node,ArrayList<Integer> array) {
		
		if(node == null) {//遍历到最后
			//计算所有值得和
			int count = 0;
			for (Integer integer : array) {
				count += integer;
			}
			
			if(count == target) {
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				list2.addAll(array);
				
				if(list.size() == 0) {
					list.add(list2);
				} else {
					int size = array.size();
					for(int i = 0; i < list.size(); i++) {
						if(list.get(i).size() < size) {
							list.add(i, list2);
							return ;
						}
					}
					list.add(list2);
				}
			}
			
		} else {//有子节点，遍历
			//加入当前节点
			array.add(node.val);
			
			//递归遍历左节点
			if(node.left != null) {
				bianli(node.left,array);
			}
		
			//递归遍历右节点
			if(node.right != null) {
				bianli(node.right,array);
			}
			
			if(node.left == null && node.right == null) {
				bianli(null,array);
			}
			
			//删除当前节点数值
			array.remove(array.size() - 1);
			
		}
		
	}
	
	//测试
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(12);
		TreeNode t4 = new TreeNode(7);
		TreeNode t5 = new TreeNode(4);
		
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		
		A24二叉树中和为某一值的路径 test = new A24二叉树中和为某一值的路径();
		
		ArrayList<ArrayList<Integer>> findPath = test.FindPath(t1,22);
		
		System.out.println(findPath);
	}

}
/**
题目描述
输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
(注意: 在返回值的list中，数组长度大的数组靠前)
*/