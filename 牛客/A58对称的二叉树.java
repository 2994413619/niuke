package ţ��;

import java.util.ArrayList;

/**
 * 
 * @author ����
 * @date 2019��12��9�� ����11:15:15
 * @Description ac:90%  ������{5,5,5,5,#,#,5,5,#,5}
 * ˼·������������ҳ�
 *
 */
public class A58�ԳƵĶ����� {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();

	boolean isSymmetrical(TreeNode pRoot) {
		
		if(pRoot == null) {
			return true;
		}
		
		//�����������������ֵ����list��
		ldr(pRoot);
		
		//�ж�list�Ƿ��ǶԳƵ�
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
	
	//�������
	private void ldr(TreeNode pRoot) {
		if(pRoot != null) {
			ldr(pRoot.left);
			list.add(pRoot.val);
			ldr(pRoot.right);
		}
	}

}
/**
��Ŀ����
��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
*/