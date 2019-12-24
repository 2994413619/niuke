package 牛客;

import java.util.Stack;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 下午5:56:51
 * @Description ac:100%
 *
 */
public class A21栈的压入弹出序列 {
	
	//测试
	public static void main(String[] args) {
		int [] pushA = {1,2,3,4,5};
		//int [] popA = {4,5,3,2,1};
		int [] popA = {4,3,5,1,2};
		System.out.println(IsPopOrder(pushA, popA));
	}

	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stackPre = new Stack<Integer>();
		Stack<Integer> stackNext = new Stack<Integer>();
		
		int index = -1;
		for(int i = 0; i < pushA.length; i++) {
			if(popA[0] == pushA[i]) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {//当用例为[1][2]的时候
			return false;
		}
		
		for(int i = 0; i < index; i++) {
			stackPre.push(pushA[i]);
		}
		
		for(int i = index + 1; i < pushA.length; i++) {
			stackNext.push(pushA[i]);
		}
		
		Integer temp1 = null,temp2 = null;
		for(int i = 1; i < popA.length; i++) {
			if(!stackPre.empty()) {
				temp1 = stackPre.pop();
			}
			
			if(!stackNext.empty()) {
				temp2 = stackNext.pop();
			}
			
			if(popA[i] == temp1) {
				stackNext.push(temp2);
			} else if(popA[i] == temp2) {
				stackPre.push(temp1);
			} else {
				return false;
			}
		}
		
		return true;
    }
	
}
/**
题目描述
输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
*/