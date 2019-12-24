package 牛客;

import java.util.Stack;

/**
 * 
 * @author 喻超
 * @date 2019年8月18日 下午3:13:40
 * @Description 通过100%
 *
 */
public class A05用两个栈实现队列 {

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(stack1.size() != 1) {
    		stack2.add(stack1.pop());
    	}
    	int node = stack1.pop();
    	while(stack2.size() != 0) {
    		stack1.push(stack2.pop());
    	}
    	return node;
    }
	
}
/*
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
