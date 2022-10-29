package A2020寒假每日一练;
//题:
//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//
//示例 1:
//
//输入: 1->1->2
//输出: 1->2
//示例 2:
//
//输入: 1->1->2->3->3
//输出: 1->2->3


//法一:吴岩松
public class A1月15 {

	public static class ListNode{
		public int val;
		public ListNode next;
		
		public ListNode(int x) {
			val = x;
		}
		//链表节点的构造函数
		//使用arr为参数，创建一个链表，当前的ListNode为链表头节点
		public ListNode(int[] arr) {
			if(arr == null || arr.length == 0)
				throw new IllegalArgumentException("arr can not be empty.");
			
			this.val = arr[0];
			ListNode cur = this;
			for (int i = 1; i < arr.length; i++) {
				cur.next = new ListNode(arr[i]);
				cur = cur.next;
			}
		}
		
		@Override
		public String toString() {
			StringBuilder res = new StringBuilder();
			ListNode cur = this;
			while (cur != null) {
				res.append(cur.val + "->");
				cur = cur.next;
			}
			res.append("NULL");
			return res.toString();
		}
	}
	
	public  ListNode deleteDuplicates(ListNode head) {
		
		ListNode p = head;
		while (p != null) {
			ListNode q = p.next;            
			while (q != null && q.val == p.val) {
				q = q.next;
			}
			p.next = q;
			p = p.next;
		}
		return head;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,4,5,6};
		ListNode head = new ListNode(nums);
		System.out.println(head);
		
		ListNode res = (new A1月15()).deleteDuplicates(head);
		System.out.println(res);
	}
}



