package 剑指OfferII专项突击版;

import 剑指OfferII专项突击版.OfferII022链表中环的入口节点.ListNode;

public class OfferII022链表中环的入口节点之快慢双指针 {

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
	public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
		// 快慢指针初始化指向 head
		ListNode fast = head;
		ListNode slow = head;
		// 快指针走到末尾时停止
		while (fast!=null) {
			// 慢指针走一步，快指针走两步
			slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
			// 快慢指针相遇，说明含有环
			if (slow == fast) {
				// 任一节点指向头节点
				fast = head;
				// 同步向前进
				while (fast!=slow) {
					fast = fast.next;
					slow = slow.next;
				}
				// 返回入口节点
				return fast;
			}	
		}
		// 不包含环
		return null;
    }
}
