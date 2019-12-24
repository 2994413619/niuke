package ţ��;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����6:13:54
 * @Description ac:100%
 *
 */
public class A22�������´�ӡ������ {

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root == null) {
			return list;
		}
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	//ȡ���׽ڵ����list��
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
��Ŀ����
�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
*/