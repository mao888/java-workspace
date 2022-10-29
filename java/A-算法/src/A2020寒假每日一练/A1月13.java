package A2020寒假每日一练;
//


import java.util.Scanner;

public class A1月13 {
	class Node {
		int val;
		Node next;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
			next = null;
		}
	}
	
	private Node makeList() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node head = new Node(sc.nextInt());
		Node cur = head;
		for (int i = 1; i < 3; i++) {
			cur.next = new Node(sc.nextInt());
			cur = cur.next;
		}
		return head;
	}
	
	public Node reList(Node head) {
		Node pre = null;
		Node cur = head;
		while(cur != null) {
			Node tempt = cur.next;
			cur.next = pre;
			 pre = cur;
			 cur = tempt;
		}
		return pre;
	}
	public static void main(String[] args) {
		A1月13 day3 = new A1月13();
		Node head = day3.makeList();
		Node newhead = day3.reList(head);
		System.out.println(newhead.val);
	}
}