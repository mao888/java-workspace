import org.omg.CORBA.PRIVATE_MEMBER;

public class BST<E extends Comparable<E>> {

	private class Node{
		public E e;					// 成员变量
		public Node left, right;	// 成员变量
		
		public Node(E e) {			// 用户传来e
			this.e = e;
			left = null;
			right = null;
		}
	}
	
	private Node root;			// 根节点
	private int size;			// 记录二分搜索数存储了多少元素
			
	public BST() {				// 二分搜索数构造函数
		root = null;
		size = 0;
	}
	
	public int size() {			// 成员函数
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
