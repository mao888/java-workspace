package Leetcode;

public class L876链表的中间结点 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val, ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	/**
	 * 思路：快指针q每次走2步，慢指针p每次走1步，当q走到末尾时p正好走到中间。
	 * */
    public ListNode middleNode(ListNode head) {
    	ListNode p1 = head;
    	ListNode p2 = head;
    	while (p2!=null&&p2.next!=null) {
			p1 = p1.next;
			p2 = p2.next.next;
		}
    	return p1;
    }

}
