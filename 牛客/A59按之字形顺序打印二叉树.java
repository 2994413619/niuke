package ţ��;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author ����
 * @date 2019��12��10�� ����10:25:55
 * @Description ac:100% 
 *
 */
public class A59��֮����˳���ӡ������ {

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if(pRoot == null) {
			return list;
		}
		
		Stack<TreeNode> left = new Stack<TreeNode>();
		Stack<TreeNode> right = new Stack<TreeNode>();
		
		
		left.push(pRoot);
		
		while(left.size() != 0 || right.size() != 0) {
			//�������������list
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
			
			//������������list
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
��Ŀ����
��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
*/