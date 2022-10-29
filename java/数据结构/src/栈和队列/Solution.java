package 栈和队列;

import java.util.Stack;

// 我们先不使用我们自己编写的stack这个类，先试用java.util.Stack这里提供的类；我们自己写的类在接口上和java.util.Stack这个类是一致的

class Solution {

	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
// 声明一个栈stack，存放的元素是Character
		for(int i = 0 ; i < s.length() ; i++) {			
// 具体看s字符串中的第i个字符是什么样的		
			char c = s.charAt(i);
//	第i个字符存成是 char c
			if(c == '(' || c == '[' || c == '{')
				stack.push(c);
// 将c push进这个stack中
			else {
// 否则的话考察的字符串中是右括号，我们需要看看栈顶的字符与这个右括号是否匹配
				if(stack.isEmpty())
					return false;
//	首先看看如果栈是空的话，那么匹配是失败的	
				
				char topChar = stack.pop();
// 将栈顶的元素pop出来，名为topChar
				if(c == ')' && topChar !='(')
					return false;
				if(c == ']' && topChar !='[')
					return false;
				if(c == '}' && topChar !='{')
					return false;
			}
		}
//	return true;错误
//	此时我们还要看一下我们的栈里是否还有字符，如果栈里还有字符，不为空的话，此时匹配还是失败的。
//	因为这就相当于我们栈存村的字符没有可匹配，只有栈 为空stack.isEmpty()为true的时候才算匹配成功了 
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {

		System.out.println((new Solution()).isValid("()[]{}"));
		System.out.println((new Solution()).isValid("([)]"));
	}
}

	
	
	