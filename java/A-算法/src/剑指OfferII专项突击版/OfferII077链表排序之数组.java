package 剑指OfferII专项突击版;
		
import java.util.Arrays;

import Leetcode.ListNode;		
								
public class OfferII077链表排序之数组 {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	int MAXSIZE = 100000;
    public ListNode sortList(ListNode head) {
    	int arr[] = new int[MAXSIZE];
    	ListNode p = head;
    	int index = 0;
    	while (p!=null) {
			arr[index] = p.val;
			index++;
			p=p.next;
		}
    	Arrays.sort(arr);
    	
    	ListNode t;
    	t = head;
    	int i =0;
    	while (t!=null) {
			t.val=arr[i];
			i++;
			t = t.next;
		}
    	return head;
    }

}
