package Leetcode;

import java.util.Stack;

public class L30包含min函数的栈 {

}

class MinStack {
	Stack<Integer> stack1;
	Stack<Integer> stack2;
    /** initialize your data structure here. */
    public MinStack() {
    	stack1 = new Stack<>();
    	stack2 = new Stack<>();
    }
    
    public void push(int x) {
    	stack1.add(x);
    	if (stack2.empty()||stack2.peek()>=x) {	// 保持栈2的非严格递增
    		stack2.add(x);
		}
    }
    
    public void pop() {
    	if(stack1.peek().equals(stack2.peek())){
    		stack1.pop();
    		stack2.pop();
    	}
    }
    
    public int top() {
    	return stack1.peek();
    }
    
    public int min() {
    	return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */