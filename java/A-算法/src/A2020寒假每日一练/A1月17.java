package A2020寒假每日一练;

//题:
//在所有数据域为x的节点之前插入一个节点


import java.util.Scanner;

//时间复杂度O(n)
public class A1月17 {
	public static void main(String[] args) {
		A1月17 d = new A1月17();
		d.testEnvironment();
	}

	// set environment
	public void testEnvironment() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("输入val："); // 3
		int k = input.nextInt();
		System.out.println("输入链表："); // 1 2 3 3 5 7 3
		// 这个input是用来过滤掉enter键
		input.nextLine();
		// 输入一行数字，以空格隔开
		String nums = input.nextLine();
		// 把输入的一行，除去空格存进数组
		String[] numsCh = nums.split(" ");
		// 先用OutputLink把这个数组变成链表，然后把k传进去
		ListNode1 result = Solution(OutputLink(numsCh), k);
		// output result
		printLink(result);
	}

	private void printLink(ListNode1 result) {
		// TODO Auto-generated method stub
		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	// Array to link
	public ListNode1 OutputLink(String[] nums) {
		// TODO Auto-generated method stub
		ListNode1 head = new ListNode1(Integer.valueOf(nums[0]));
		ListNode1 prev = head;
		for (int i = 1; i < nums.length; i++) {
			ListNode1 temp = new ListNode1(Integer.valueOf(nums[i]));
			prev.next = temp;
			prev = prev.next;
		}
		return head;
	}

	/************************* 正文 *****************************/
	public ListNode1 Solution(ListNode1 head, int val) {
		// TODO Auto-generated method stub
		ListNode1 way1 = solveIteration(head, val);
//		ListNode way2 = solveRecursion(head, val);

		return way1;
	}

	private ListNode1 solveIteration(ListNode1 head, int val) {
		// TODO Auto-generated method stub
		//发现val，就在前面加上一个3
		ListNode1 curr = head;
		while(curr.next != null) {
			if(curr.next.val == val) {
				ListNode1 temp = curr.next;
				curr.next = new ListNode1(3);
				curr.next.next = temp;
				curr = curr.next;
			}
			curr = curr.next;
		}
		
		if(head.val == val) {
			ListNode1 temp = head;
			head = new ListNode1(3);
			head.next = temp;
		}
		return head;
	}
}

/************************* 正文 *****************************/
class ListNode1 {

	int val;
	ListNode1 next;

	ListNode1(int x) {
		val = x;
	}
}
