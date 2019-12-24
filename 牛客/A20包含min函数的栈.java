package ţ��;

import java.util.Stack;

/**
 * 
 * @author ����
 * @date 2019��8��23�� ����5:31:04
 * @Description ac:100%
 *
 */
public class A20����min������ջ {

	private Stack<Integer> stack = new Stack<Integer>();
	private int min;
	private int size = 0;
	
	public void push(int node) {
		if(size == 0) {
			min = node;
		} else {
			min = node < min ? node : min;
		}
		stack.push(node);
		size++;
    }
    
    public void pop() {
    	if(!stack.empty()) {
    		if(stack.pop() == min) {
    			min = 999999999;
        		Stack<Integer> stackTemp = new Stack<Integer>();
        		Integer temp;
        		while((temp = stack.pop()) != null) {
        			min = min < temp ? min : temp;
        			stackTemp.push(temp);
        			if(stack.empty()) {
        				break;
        			}
        		}
        		
        		while((temp = stackTemp.pop()) != null) {
        			stack.push(temp);
        			if(stackTemp.empty()) {
        				break;
        			}
        		}
        		
        	}
    		size--;
    	}
    	if(size == 0) {
    		min = 0;
    	}
    	
    }
    
    public int top() {
        int temp = stack.pop();
        stack.push(temp);
        return temp;
    }
    
    public int min() {
        return min;
    }
	
    //����
    @org.junit.Test
    public void test() {
    	A20����min������ջ  mystack = new A20����min������ջ();
    	mystack.push(3);
    	System.out.println(mystack.min);
    	mystack.push(4);
    	System.out.println(mystack.min);
    	mystack.push(2);
    	System.out.println(mystack.min);
    	mystack.push(3);
    	System.out.println(mystack.min);
    	mystack.pop();
    	System.out.println(mystack.min);
    	mystack.pop();
    	System.out.println(mystack.min);
    }
    
}
/**
��Ŀ����
����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
*/