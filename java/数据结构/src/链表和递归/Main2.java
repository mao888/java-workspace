package Á´±íºÍµÝ¹é;

import java.util.Stack;

public class Main2 {

	public static void main(String[] args) {

		
		
		
		
		ArrayStack<Integer> stack = new ArrayStack<>();
		
		for(int i = 0 ; i < 5 ; i ++) {
			stack.push(i);
			System.out.println(stack);
		}
	
		stack.pop();
		System.out.println(stack);
	}

}
