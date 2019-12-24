package 牛客;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 下午7:18:36
 * @Description ac:100%
 * 思路：数组最后一个数就是二叉树的根节点。剩下的数可以分为三种情况：
 * 1、全小于最后一个数：根节点的左子树
 * 2、全大于最后一个数：根节点的右子树
 * 3、前面一部分小于根节点，后一部分大于根节点
 * 
 * 其他情况都不符合二叉搜索树后续遍历的情况
 */
public class A23二叉搜索树的后序遍历序列 {

	public static boolean VerifySquenceOfBST(int [] sequence) {
		
		if(sequence.length <= 0){
            return  false;
        }
		
        return judge(sequence, 0, sequence.length - 1);
    }
	
	//判断
	public static Boolean judge(int[] array, int start, int end) {
		if(end - start + 1 > 2) {//长度小于等于直接返回true；
			int flag;//1:表示第一个数大于根节点；0:表示第一个数小于根节点
			if(array[start] > array[end]) {
				flag = 1;
			} else {
				flag = 0;
			}
			
			if(flag == 1) {//只有右子树
				for(int i = start + 1; i < end; i++) {
					if(array[i] < array[end]) {
						return false;
					}
				}
				return judge(array,start,end - 1);//递归判断子树
			} else {//有左子树
				int index = start;//左子树最后节点坐标
				int x = 0;//0:遍历的为左子树；1：遍历的是右子树
				for(int i = start + 1; i < end; i++) {
					if(x == 0) {
						if(array[i] > array[end]) {
							x = 1;
						} else {
							index = i;
						}
					} else {
						if(array[i] < array[end]) {
							return false;
						}
					}
				}
				
				return judge(array, start, index) && judge(array, index + 1, end - 1);
				
			}
			
		}
		return true;
	}
	
	//测试
	public static void main(String[] args) {
		int[] array = {7,4,6,5};
		System.out.println(VerifySquenceOfBST(array));
	}
	
}
/*
题目描述
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
*/