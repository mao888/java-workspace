package 链表和递归;

public class LinkedListStack<E> implements Stack<E> {
// LinkedListStack<E>支持泛型      implements实现Stack这样一个接口
	private LinkedList list;
// 私有的链表类的对象  叫 list		
	
// 构造函数
	public LinkedListStack(){
		list = new LinkedList<>(); 			// 初始化list
	}
// 由于我们这链表栈  底层实现是链表 ，对链表来说也没有容积这个概念了，所以我们构造函数就这一个就够了

//  一一的构造方法
	@Override
	 public int getSize() {
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		list.addFirst(e);
// 对链表头操作是O(1)级别的，所以调用addFirst将e添加进去，也就是链表头是栈顶	
	}
	
	@Override
	public E pop() {
		return (E) list.removeFirst();
//	从链表头取出元素
	}

	@Override
	public E peek() {
		return (E) list.getFirst();
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Stack: top");
		res.append(list);
		return res.toString();
//	利用我们之前链表中实现的各个功能封装了一个底层是链表实现的链表栈
	}

	public static void main(String[] args) {
			
			LinkedList<Integer> stack = new LinkedList<>();
			
			for(int i = 0 ; i < 5 ; i ++) {
				stack.push(i);
				System.out.println(stack);
			}
		
			stack.pop();
			System.out.println(stack);
		}



}
