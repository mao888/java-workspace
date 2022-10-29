package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class L19删除链表的倒数第N个结点之双指针 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode p1 = head;
    	ListNode p2 = head;
    	if (head==null||head.next==null) {
			return null;
		}
    	//先让快指针走n步
    	for(int i=0;i<n;i++) {
			p1 = p1.next;
    	}
    	// 如果快指针走到了最后说明删除的是第一个节点，就返回head.next就好
    	if(p1 == null) {
    		return head.next;
    	}
    	while (p1.next!=null) {
			p1 = p1.next;
			p2 = p2.next;
		}
    	p2.next = p2.next.next;
    	return head;
    	
    }
    
}
