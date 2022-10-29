package 剑指OfferII专项突击版;

import java.util.HashSet;
import java.util.Set;

//import 剑指OfferII.OfferII023两个链表的第一个重合节点.ListNode;

public class OfferII023两个链表的第一个重合节点之哈希集合 {

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
		 Set<ListNode> set = new HashSet<>();
		 ListNode temp = headA;
		 while (temp!=null) {
			set.add(temp);
			temp = temp.next;
		}
		 temp = headB;
		 while (temp!=null) {
			 if (set.contains(temp)) {
				return temp;
			}
			 temp = temp.next;
		}
		 return null;		 
	 }
}