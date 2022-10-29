package Leetcode;

import java.util.Stack;

public class L09用两个栈实现队列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void appendTail(int value) {
    	stack1.add(value);
    }
    
    public int deleteHead() {
    	if (stack2.isEmpty()) {
			if (stack1.isEmpty()) {
				return -1;
			}
			while (!stack1.isEmpty()) {
				stack2.add(stack1.pop());
			}
			return stack2.pop();
    	}else {
			return stack2.pop();
		}
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */