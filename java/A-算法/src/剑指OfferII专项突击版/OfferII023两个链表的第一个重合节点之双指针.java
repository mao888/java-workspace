package 剑指OfferII专项突击版;

import 剑指OfferII专项突击版.OfferII023两个链表的第一个重合节点之哈希集合.ListNode;

public class OfferII023两个链表的第一个重合节点之双指针 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 if (headA==null||headB==null) {
			return null;
		}
		 ListNode pa = headA;
		 ListNode pb = headB;
		 while (pa!=pb) {
			if (pa==null) {
				pa = headB;
			}
			pa = pa.next;
			if (pb==null) {
				pb = headB;
			}
			pb = pb.next;
		}
		 return pb;
	 }

}
