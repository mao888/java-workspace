package 剑指OfferII专项突击版;

import Leetcode.ListNode;

public class OfferII077链表排序之归并排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public ListNode sortList(ListNode head) {
		if (head==null||head.next==null) {
			return head;
		}
		// 第一步：将链表拆分成两半
		ListNode fast = head;
		ListNode slow = head;
		ListNode prev = head;
		while (fast!=null&&fast.next!=null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		// 第二步：将两部分的链表分别排序
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(slow);
		// 第三步：合并两个有序链表
		return merge(l1, l2);
	}
	
	public ListNode merge(ListNode l1,ListNode l2) {
		ListNode p = new ListNode();
		ListNode l = p;
		while (l1 != null && l2 !=null) {
			if (l1.val<l2.val) {
				p.next = l1;
				l1 = l1.next;
			}else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if (l1!=null) {
			p.next = l1;
		}
		if (l2!=null) {
			p.next = l2;
		}
		return l.next;
	}

}
