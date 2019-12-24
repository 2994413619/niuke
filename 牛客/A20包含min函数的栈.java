package 牛客;

import java.util.Stack;

/**
 * 
 * @author 喻超
 * @date 2019年8月23日 下午5:31:04
 * @Description ac:100%
 *
 */
public class A20包含min函数的栈 {

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
	
    //测试
    @org.junit.Test
    public void test() {
    	A20包含min函数的栈  mystack = new A20包含min函数的栈();
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
题目描述
定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
*/