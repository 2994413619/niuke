package ţ��;

import java.util.Arrays;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����2:33:40
 * @Description ͨ��100%
 *
 */
public class A04�ؽ������� {
	
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode treeNode = reConstructBinaryTree(pre,in);
		System.out.println(treeNode.val);
	}
	

	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //�ж������Ƿ�Ϊ��
		if(pre.length == 0) {
			return null;
		}
		
		//1����õ�һ�����ڵ�
		TreeNode root = new TreeNode(pre[0]);
		
		//2�����ݵ�һ���ڵ��pre��in�ֳ���������
		//---Ѱ�����������root��λ��
		int index;
		for(index = 0; index < in.length; index++) {
			if(pre[0] == in[index]) {
				break;
			}
		}
		
		//---�������飬�ҳ�����������ǰ���������
		int[] childInLeft = Arrays.copyOfRange(in, 0, index);
		int[] childPreLeft = Arrays.copyOfRange(pre, 1, 1 + childInLeft.length);
		
		int[] childInRight = Arrays.copyOfRange(in, index + 1, in.length);
		int[] childPreRight = Arrays.copyOfRange(pre, 1 + childInLeft.length, pre.length);
		
		//3��Ϊ���ڵ������������
		addTree(root, childPreLeft, childInLeft, 1);
		addTree(root, childPreRight, childInRight, 0);
		
		
		return root;
    }
	
	
	//Ϊ�ڵ������������:flag = 1��ʾ��ڵ㣬0��ʾ�ҽڵ�
	public static void addTree(TreeNode node, int[] pre, int[] in, int flag) {
		//�����ݹ飺pre��in����Ϊ0
		if(pre.length == 0 || in.length == 0) {
			return ;
		}
		
		//Ϊnode������ҽڵ�
		TreeNode childNode =new TreeNode(pre[0]);
		if(flag == 1) {
			node.left = childNode;
		} else {
			node.right = childNode;
		}
		
		//�ݹ�Ϊnode���ӽڵ�����ӽڵ�
		//2�����ݵ�һ���ڵ��pre��in�ֳ���������
		//---Ѱ�����������root��λ��
		int index;
		for(index = 0; index < in.length; index++) {
			if(pre[0] == in[index]) {
				break;
			}
		}
		
		//---�������飬�ҳ�����������ǰ���������
		int[] childInLeft = Arrays.copyOfRange(in, 0, index);
		int[] childPreLeft = Arrays.copyOfRange(pre, 1, 1 + childInLeft.length);
		
		int[] childInRight = Arrays.copyOfRange(in, index + 1, in.length);
		int[] childPreRight = Arrays.copyOfRange(pre, 1 + childInLeft.length, pre.length);
		
		//3��Ϊ���ڵ������������
		addTree(childNode, childPreLeft, childInLeft, 1);
		addTree(childNode, childPreRight, childInRight, 0);
	}
	
}

/*
����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
���������ǰ���������������Ľ���ж������ظ������֡�
��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
*/