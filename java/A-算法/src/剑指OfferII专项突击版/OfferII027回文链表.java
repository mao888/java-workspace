package 剑指OfferII专项突击版;

import java.util.ArrayList;
import java.util.List;

import Leetcode.ListNode;

public class OfferII027回文链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isPalindrome(ListNode head) {
    	List<Integer> list = new ArrayList<>();
    	ListNode curr = head;
    	while (curr!=null) {
    		list.add(curr.val);
			curr = curr.next;
		}
    	int i = 0;
    	int j = list.size()-1;
    	while (i<j) {
    		if (!list.get(i).equals(list.get(j))) {
				return false;
			}
    		i++;
    		j--;
		}
    	return true;
    }

}
