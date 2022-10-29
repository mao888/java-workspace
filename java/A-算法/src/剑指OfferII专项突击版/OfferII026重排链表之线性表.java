package 剑指OfferII专项突击版;

import java.util.ArrayList;
import java.util.List;

public class OfferII026重排链表之线性表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode {
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;
		}
	}
    public void reorderList(ListNode head) {
    	if (head==null) {
    		return ;
		}
    	List<ListNode> list = new ArrayList<ListNode>();
    	ListNode node = head;
    	while (node!=null) {
			list.add(node);
			node = node.next;
		}
    	int i = 0;
    	int j = list.size()-1;
    	while (i < j) {
    		list.get(i).next = list.get(j);
    		i++;
    		if (i == j) {
				break;
			}
    		list.get(j).next = list.get(i);
    		j--;
    	}
    	list.get(i).next = null;
    }

}
