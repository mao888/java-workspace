
package A2020寒假每日一练;
 
// 题:升序合并两个链表

////法一:陈光岚
//import java.util.Scanner;
//
//public class A1月11 {
//	static class ListNode{
//		int val;
//		ListNode next;
//		public ListNode(int val) {
//			// TODO Auto-generated constructor stub
//			this.val = val;
//			next = null;
//		}
//		
//		public ListNode(int[] arr) {
//			this.val = arr[0];
//			ListNode cur = this;
//			for (int i = 1; i < arr.length; i++) {
//				cur.next = new ListNode(arr[i]);
//				cur = cur.next;
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		ListNode l1 = null;
//		ListNode l2 = null;
//		for (int i = 0; i < 15; i++) {
//			 l1 = new ListNode(sc.nextInt());
//			 l1 = l1.next;
//		}
//		for (int i = 0; i < 15; i++) {
//			l2 = new ListNode(sc.nextInt());
//			l2 = l2.next;
//		}
//		
//		ListNode l3 = sum(l1,l2);
//		while (l3 != null) {
//			System.out.print(l3.val + " ");
//			l3 = l3.next;
//		}
//	}
//
//	public static ListNode sum(ListNode l1, ListNode l2) {
//		if (l1 == null) {
//			return l2;
//		}
//		if (l2 == null) {
//			return l1;
//		}
//		if (l1.val < l2.val) {
//			l1.next = sum(l1.next, l2);
//			return l1;
//		} else {
//			l2.next = sum(l2.next, l1);
//			return l2;
//		}
//	}
//}

//法二:李甲坤
//import java.util.Scanner;
//
//class ListNode {
//	int val;
//	ListNode next;
//	ListNode(int val) {
//		this.val = val;
//	}
//	
//	public void add(int newval) {
//		ListNode newNode = new ListNode(newval);
//		if(this.next == null)
//			this.next = newNode;
//		else
//			this.next.add(newval);
//	}
//	
//	public void print() {
//		System.out.print(this.val);
//		if(this.next != null) {
//			System.out.print(" ");
//			this.next.print();
//		}
//	}
//}
//
//class Merge {
//	public ListNode inputList() {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		
//		ListNode li = new ListNode(Integer.MIN_VALUE);
//		for(int i=0;i<arr.length;i++) {
//			li.add(Integer.parseInt(arr[i]));
//		}
//		return li;
//	}
//	
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        else if (l2 == null) {
//            return l1;
//        }
//        else if (l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }
//        else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }
//}
//
//public class A1月11 {
//	public static void main(String[] args) {
//    	ListNode l1 = new Merge().inputList();
//    	ListNode l2 = new Merge().inputList();
//    	new Merge().mergeTwoLists(l1, l2).next.next.print();
//	}
//}









