package ţ��;

import java.util.ArrayList;

/**
 * 
 * @author ����
 * @date 2019��9��7�� ����1:49:17
 * @Description ac:100%
 *
 */
public class A24�������к�Ϊĳһֵ��·�� {

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
		
		if(node == null) {//���������
			//��������ֵ�ú�
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
			
		} else {//���ӽڵ㣬����
			//���뵱ǰ�ڵ�
			array.add(node.val);
			
			//�ݹ������ڵ�
			if(node.left != null) {
				bianli(node.left,array);
			}
		
			//�ݹ�����ҽڵ�
			if(node.right != null) {
				bianli(node.right,array);
			}
			
			if(node.left == null && node.right == null) {
				bianli(null,array);
			}
			
			//ɾ����ǰ�ڵ���ֵ
			array.remove(array.size() - 1);
			
		}
		
	}
	
	//����
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
		
		A24�������к�Ϊĳһֵ��·�� test = new A24�������к�Ϊĳһֵ��·��();
		
		ArrayList<ArrayList<Integer>> findPath = test.FindPath(t1,22);
		
		System.out.println(findPath);
	}

}
/**
��Ŀ����
����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
*/