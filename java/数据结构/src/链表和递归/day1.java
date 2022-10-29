package Á´±íºÍµÝ¹é;

import java.util.Scanner;

public class day1 {
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
			next = null;
		}
		
		public ListNode(int[] arr) {
			this.val = arr[0];
			ListNode cur = this;
			for (int i = 1; i < arr.length; i++) {
				cur.next = new ListNode(arr[i]);
				cur = cur.next;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr1 = new int[15];
//		int[] arr2 = new int[15];
//		for (int i = 0; i < arr1.length; i++)
//			arr1[i] = sc.nextInt();
//
//		for (int i = 0; i < arr2.length; i++)
//			arr2[i] = sc.nextInt();
//
//		ListNode l1 = new ListNode(arr1);
//		ListNode l2 = new ListNode(arr2);
		
		ListNode l1 = null;
		ListNode l2 = null;
		for (int i = 0; i < 15; i++) {
			 l1 = new ListNode(sc.nextInt());
			 l1 = l1.next;
		}
		for (int i = 0; i < 15; i++) {
			l2 = new ListNode(sc.nextInt());
			l2 = l2.next;
		}
		
		ListNode l3 = sum(l1,l2);
		while (l3 != null) {
			System.out.print(l3.val + " ");
			l3 = l3.next;
		}
	}

	public static ListNode sum(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			l1.next = sum(l1.next, l2);
			return l1;
		} else {
			l2.next = sum(l2.next, l1);
			return l2;
		}

	}
}
