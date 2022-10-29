package Leetcode;
//题203:移除链表元素
//删除链表中等于给定值 val 的所有节点。
//
//示例:
//
//输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// 题解1
//class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//    	while(head !=null && head.val ==  val){
//    		ListNode delNode = head;
//    		head = head.next;
//    		delNode.next = null;
//    	}
//    	if(head == null)
//    		return null;
//    	
//    	ListNode prev = head;
//    	while(prev.next != null) {
//    		if(prev.next.val == val) {
//    			ListNode delNode = prev.next;
//    			prev.next = delNode.next;
//    			delNode.next = null;
//    		}
//    		else
//    			prev = prev.next;
//    	}
//    	return head;
//	}
//}


// 题解2
//class Solution {
//	public ListNode removeElements(ListNode head, int val) {
//		while(head !=null && head.val ==  val)
//			head = head.next;
//		
//		if(head == null)
//			return null;
//	
//		ListNode prev = head;
//		while(prev.next != null) {
//			if(prev.next.val == val) 
//				prev.next = prev.next.next;
//			else
//				prev = prev.next;
//		}
//		return head;
//	}
//}


//题解3 虚拟头节点
//class Solution {
//	public ListNode removeElements(ListNode head, int val) {
//		ListNode dummyHead = new ListNode(-1);
//		dummyHead.next = head;
//	
//		ListNode prev = dummyHead;
//		while(prev.next != null) {
//			if(prev.next.val == val) 
//				prev.next = prev.next.next;
//			else
//				prev = prev.next;
//		}
//		return head;
//	}
//}









