package ţ��;

import java.util.Stack;

/**
 * 
 * @author ����
 * @date 2019��8��18�� ����3:13:40
 * @Description ͨ��100%
 *
 */
public class A05������ջʵ�ֶ��� {

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
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 */
