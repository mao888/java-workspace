package 链表和递归;


import java.util.*;


//基于动态数组的实现创建的一个栈这样的类
public class ArrayStack<E> implements Stack<E> {
//首先支持泛型
	Array arry;
	private Array array;
	
	public ArrayStack(int capacity) {
//capacity容积
		array = new Array();
	}
	
	public ArrayStack(){
		Object array = new Array();
	}

	@Override
	
	
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
