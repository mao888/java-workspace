package 剑指OfferII专项突击版;

import java.util.Iterator;
import java.util.LinkedList;

public class OfferII021删除链表的倒数第n个结点 {
	
	// 自定义的ListNode链表类如下：
	public class ListNode {
	       int val;
	       ListNode next;   // 下一个链表对象
	       ListNode(int x) { val = x; }  //赋值链表的值
	  }
		
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	// 创建辅助头节点，head , fast 和 slow 都指向这个辅助头节点
        ListNode fast =  new ListNode(0);
        fast.next = head;
        head = fast;
        ListNode slow = fast;

        // fast 指针先走 n + 1 个单位
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }

        // fast 指针和 slow 指针一起移动，直到 fast 指向空后，slow 指针则指向倒数第 n + 1个节点。
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        // 删除倒数第 n 个节点
        slow.next = slow.next.next;

        // 由于我们设置了辅助头节点，所以 head.next 才是链表的首元节点。
        return head.next;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5};
//		int n =2;
		/**
		ListNode nodestr = new ListNode(0); //创建首结点
	    ListNode nextNode;     //创建下一个结点
	    nextNode = nodestr;    //指向首结点
	    for (int i = 0; i < nums.length; i++) {
			ListNode newnode = new ListNode(i);		// 创建新的节点
			nextNode.next = newnode;	// 把新结点连起来
			nextNode = nextNode.next;	// 把结点往后移
		}//nextNode指向最后一个结点
	    
	     nextNode = nodestr;  //重新指向首结点
	     //打印
	     while(nextNode != null){
	         System.out.println("第一个结点值："+ nextNode.val);
	         nextNode = nextNode.next;
	     }*/

		System.err.println(new OfferII021删除链表的倒数第n个结点().removeNthFromEnd(null, 0));
		
	}
	

}
