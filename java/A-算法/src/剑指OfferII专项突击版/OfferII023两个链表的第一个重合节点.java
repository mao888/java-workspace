package 剑指OfferII专项突击版;

public class OfferII023两个链表的第一个重合节点 {

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
     ListNode n1 = headA;
     ListNode n2 = headB;
     
     int size1 = 0;
     int size2 = 0;
     // 获取A的长度
     while (n1!=null) {
		size1++;
		n1 = n1.next;
	}
     // 获取B的长度
     while (n2!=null) {
    	 size2++;
    	 n2 = n2.next;
	}
     
     // 将A,B中较长的一个移动dif步，使两个链表一样长
     if (size1 >  size2) {
    	 int dif = size1 - size2;
    	 for (int i = 0; i < dif; i++) {
			headA = headA.next;
		}
	}else {
		int dif = size2 - size1;
		 for (int i = 0; i < dif; i++) {
				headB = headB.next;
			}
	}
     // 遍历链表公共节点
     while (headA!=null) {
		if (headA==headB) {
			return headA;
		}else {
			headA = headA.next;
			headB = headB.next;
		}
	}
    	return null;
    }
	
	

}