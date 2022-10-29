package A2020寒假每日一练;

// 题:输入一个链表，输出该链表中倒数第k个节点
//法一:陈光岚
//import java.util.*;
//public class A1月12日 {
//	class Node {
//		int val;
//		Node next;
//
//		public Node(int val) {
//			// TODO Auto-generated constructor stub
//			this.val = val;
//			next = null;
//		}
//	}
//
//	private Node makeList() {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		Node head = new Node(sc.nextInt());
//		Node cur = head;
//		for (int i = 1; i < 3; i++) {
//			cur.next = new Node(sc.nextInt());
//			cur = cur.next;
//		}
//		return head;
//	}
//
//	private  void print(Node head, int k) {
//		// TODO Auto-generated method stub
//		while (head != null) {
//			Node cur = head;
//			
//			for (int i = 0; i < k; i++)
//				cur = cur.next;
//
//			if (cur == null) {
//				System.out.println(head.val);
//				break;
//				}
//			else
//				head = head.next;
//		}
//	}
//	
//	public static void main(String[] args) {
//		A1月12日 h = new A1月12日();
//		Node l2 = h.makeList();
//		h.print(l2,3);
//	}
//}

//class Day02{
//	public ListNode FindKthToTail(ListNode head,int k){
//		ListNode a = null;
//		ListNode b = null;
//		
//		a = head;
//		b = head;
//		int c = k;
//		int count = 0;
//		while(a!=null){
//			a = a.next;
//			count++;
//			if(k<1){
//				b = b.next;
//			}
//			k--;
//		}
//		if(count<c)
//			return null;
//		return b;
//	}
//}



//胡云飞解法:
//import java.util.Scanner;
//
////时间复杂度O(n)
//public class A1月12日 {
//	public static void main(String[] args) {
//		A1月12日 d = new A1月12日();
//		d.testEnvironment();
//		
//	}
//	//set environment
//	public void testEnvironment() {
//		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		System.out.println("输入K：" );
//		int k = input.nextInt();
//		System.out.println("输入链表：" );
//		//这个input是用来过滤掉enter键
//		input.nextLine();
//		//输入一行数字，以空格隔开
//		String nums = input.nextLine();
//		//把输入的一行，除去空格存进数组
//		String[] numsCh = nums.split(" ");
//		//先用OutputLink把这个数组变成链表，然后把k传进去
//		String result = Solution(OutputLink(numsCh),k);
//		//output result
//		System.out.println(result);
//	}
//	//Array to link
//	public ListNode OutputLink(String[] nums) {
//		// TODO Auto-generated method stub
//		ListNode head = new ListNode(nums[0]);
//		ListNode prev = head; 
//		for(int i = 1 ; i < nums.length ; i++) {
//			ListNode temp = new ListNode(nums[i]);
//			prev.next = temp;
//			prev = prev.next;
//		}
//		return head;
//	}
//	/*************************正文*****************************/
//	public String Solution(ListNode head,int k) {
//		// TODO Auto-generated method stub
//		//我的想法是先用一个循环找到link的length，然后再遍历一次，就能找到length - k的数字了
//		
//		//temp保存一下头节点
//		ListNode temp = head;
//		//这个循环用来查看当前链表的长度
//		int i = 0;
//		while(temp != null) {
//			temp = temp.next;
//			i++;
//		}
//		//此时链表的长度就是i+1,因为当temp=null的时候，还会加1
//		int len = i;
//		//重置i和temp
//		i = 0;
//		temp = head;
//		//重新遍历  当i == len-k  就是倒数第k个数，返回当前temp的值
//		while(i != (len-k)) {
//			temp = temp.next;
//			i++;
//		}
//		return temp.val;
//	}
//}
//
//class ListNode {
//	
//	String val;
//	ListNode next;
//	
//	ListNode(String x){
//		val = x;
//	}
//}

