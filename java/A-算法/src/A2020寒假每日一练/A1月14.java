package A2020寒假每日一练;

//删除链表中等于给定值 val 的所有节点。
//
//示例:
//
//输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5


import java.util.Scanner;

//时间复杂度O(n)
public class A1月14{
	public static void main(String[] args) {
		A1月14 d = new A1月14();
		d.testEnvironment();
	}
	//set environment

//	主环境搭建
	public void testEnvironment() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("输入val：" );
		int val = input.nextInt();
		System.out.println("输入链表：" );
		//这个input是用来过滤掉enter键
		input.nextLine();
		//输入一行数字，以空格隔开
		String nums = input.nextLine();
		//把输入的一行，除去空格存进数组
		String[] numsCh = nums.split(" ");
		//先用OutputLink把这个数组变成链表，然后把k传进去
		ListNode result = Solution(OutputLink(numsCh),val);
		//output result
		printLink(result);
	}
	//Array to link
//	给一个数组，变成链表
	public ListNode OutputLink(String[] nums) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(Integer.valueOf(nums[0]));
		ListNode prev = head; 
		for(int i = 1 ; i < nums.length ; i++) {
			ListNode temp = new ListNode(Integer.valueOf(nums[i]));
			prev.next = temp;
			prev = prev.next;
		}
		return head;
	}
//	接受头结点，遍历整个链表
	private void printLink(ListNode result) {
		// TODO Auto-generated method stub
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	
	/*************************正文*****************************/
	public ListNode Solution(ListNode head, int val) {
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;

		ListNode prev = dummyHead;
		while(prev.next != null) {
			if(prev.next.val == val) 
				prev.next = prev.next.next;
			else
				prev = prev.next;
		}
		return dummyHead.next;
	}
	
}

// 节点模板
class ListNode {
	
	int val;
	ListNode next;
	
	ListNode(int x){
		val = x;
	}
}




