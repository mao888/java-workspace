package 链表和递归;

public class LinkedList<E> {
// 支持泛型
	private class Node{
//	拥有两个成员变量
		public E e;
//	一个成员变量存放的元素是E类型的e
		public Node next;
//	.............next,指向Node;
		
//	为这个类设置专门的构造函数
		public Node(E e,Node next) {
			this.e = e;
//	将节点的e赋值成用户传来的e
			this.next = next;
//	将节点的next赋值成用户传来的next
		}
		
// 设置一些更方便的函数，如果用户传来一个e的话，调用有两个参数的构造方法
		public Node(E e){
			//this(e, next:null);
			this.e = e; 
			this.next = null;
//	赋值空
		} 
		public Node(){
			//this(e:null, next:null);
			this.e = null;
			this.next = null;
		}
		
// 对于链表的每一个节点，相应的设置他们的一个父类toString()函数来进行打印输出	
		@Override
		public String toString() {
				return e.toString();
		}
	}
	private Node dummyHead;
// 在整个链表中应该有一个Node的型的变量，叫做head
	private int size;
// 存储一个size这样一个int型变量

// 有了这些，相应的为我们的链表设置构造函数
	public LinkedList() {
		dummyHead = new Node(null, null);
		size = 0;
//	此时对于这个空的链表来说，存在一个虚拟节点
//	还可以构造其他函数，比如将数组转换成列表
	}
	
// 为链表写两个基本方法
// 一:获取链表中的元素个数
	public int getSize() {
		return size;
	}
// 二:返回链表是否为空
	public boolean isEmpty() {
		return size == 0;
	}
// 三:在链表头添加新的元素e
//	public void addFirst(E e) {	
// 在线性数据结构的头部添加元素，传 如的是一个E类型的e
// 创建一个新的节点，它里面传入的元素e,next不管，为空

// 法一
//		Node node = new Node(e);
//		  node.next = head;
//		  head = node;
		
// 法二
//		  head = new Node(e,head);
//		add(0,e);
//		size ++;
//	末尾
//	 }	

// 在链表的index(0-based)位置添加新的元素e
// 在链表中不是一个常用的操作，练习用：)
	public void add(int index,E e) {
// 传入两个参数 index , e	

// 判断index的合法性
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed.Illegal index.");
		 	// 非法
		
//		if (index == 0)
//			addFirst(e);
//		else {
//	以前对头结点处理需要，现在不需要了	
		
//	遍历
		Node prev = dummyHead;			// dummyHead  index 前  ;     prev 前一个
//	dummyHead是0元素前一个节点
		for(int i = 0 ;i < index ; i++)
//  head开始：index0 - 1 ; dummyHead开始: index
			prev = prev.next;

//	法一
//			Node node = new Node(e);
//			node.next = prev.next;
//			prev.next = node;
		
// 法二
			prev.next = new Node(e , prev.next);
			size ++;					
		}
// 在链表头添加新的元素e
	public void addFirst(E e) {
		add(0,e);
	}
// 在链表末尾添加新的元素e;
	public void addLast(E e) {
		add(size, e);
	} 

//	遍历
//获得链表的第index(0-based)个位置元素
//在链表中不是一个常用的操作，练习用：)
	public E get(int index) {

//判断index的合法性
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("Get failed.Illegal index.");
		 	// 非法
	
// 从0开始遍历，
		Node cur = dummyHead.next;			// dummyHead.next index当前  ；cur：当前
		for(int i = 0 ; i < index ; i ++)
			cur = cur.next;
		return cur.e;
	}

	// 获取链表的第一个元素
	public E getFirst() {
		return get(0);
	}

	// 获得链表的最后一个元素
	public E getLast() {
		return get(size - 1);
	}

	//修改链表的第index(0-based)个位置到的元素为e
	//在链表中不是一个常用的操作，练习用：)
	public void set(int index,E e) {
		
//判断index的合法性
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("Set failed.Illegal index.");
				// 非法		

// 遍历
		Node cur = dummyHead.next;
		for(int i = 0 ; i < index ; i ++)
			cur = cur.next;
		cur.e = e ;
	}

// 查找链表中是否有元素e
	public boolean contains(E e) {

//	也可以使用size进行for循环
		Node cur = dummyHead.next;
		while(cur != null) {
			if(cur.e.equals(e))			// cur.e  是否等于用户传来的e
				return true;
			cur = cur.next;
//	等cur空了  说明把整个链表遍历完了一遍
		}
		return false;
	}
//  复习一下，覆盖 object类这个的方法，也就是toString这个方法
	
	
	//从链表中删除index(0-based)位置的元素为，返回删除的元素
		//在链表中不是一个常用的操作，练习用：)
	public E remove(int index) {
		
	//判断index的合法性
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("Set failed.Illegal index.");
				// 非法		

// 首先要找到待删除的index之前的节点，所以 dummyHead
		Node prev = dummyHead;
		for(int i = 0 ; i < index ; i++)
			prev = prev.next;
		
		Node retNode = prev.next;
		prev.next = retNode.next;
		retNode.next = null;
		size --;
		
		return retNode.e;
	}
	
// 从链表中删除第一个元素，返回删除的元素
	public E removeFirst() {
		return remove(0);
	}
	
// 从链表中删除最后一个元素，返回删除的元素
	public E removeLast() {
		return remove(size - 1);
	}
	
	@Override
	public String toString(){
		
		StringBuilder res = new StringBuilder();

//	法一
// 		Node cur = dummyHead.next;
////	声明一个  cur 的 node
//		while(cur != null) {
//			res.append(cur + "->");
//			cur = cur.next;
//		}
		
//	法二
		for(Node cur = dummyHead.next ; cur !=null ; cur = cur.next)
			res.append(cur + "->");
		res.append("NULL");
		
		return res.toString();
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		
	}
}


 








