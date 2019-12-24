package ţ��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author ����
 * @date 2019��12��11�� ����9:14:19
 * @Description ac:100%
 *
 */
public class A62�����������ĵ�k����� {
	
	private List<TreeNode> list = new ArrayList<TreeNode>();

	TreeNode KthNode(TreeNode pRoot, int k) {
		
		if(k <= 0 || pRoot == null) {
			return null;
		}
		
		//������ýڵ㼯��
		ldf(pRoot);
		
		//kֵ�����ܽ����������null
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
	
	//����������
	private void ldf(TreeNode node) {
		
		if(node != null) {
			list.add(node);
			
			ldf(node.left);
			ldf(node.right);
		}

	}

}
/**
 * ��Ŀ���� ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8�� �У��������ֵ��С˳�����С����ֵΪ4��
 */