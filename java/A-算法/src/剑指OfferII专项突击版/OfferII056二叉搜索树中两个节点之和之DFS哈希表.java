package 剑指OfferII专项突击版;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import 剑指OfferII专项突击版.OfferII056二叉搜索树中两个节点之和之Map.TreeNode;

public class OfferII056二叉搜索树中两个节点之和之DFS哈希表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){};
		TreeNode(int val){
			this.val = val;
		}
		TreeNode(int val,TreeNode left,TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}	
	}
    public boolean findTarget(TreeNode root, int k) {
    	// 创建一个哈希表：存放已经遍历过的节点值
    	Set<Integer> set= new HashSet<>();
    	// 辅助栈：辅助进行中序遍历
    	Deque<TreeNode> stack = new ArrayDeque<>();
    	// 中序遍历
    	while (root!=null || !stack.isEmpty()) {
    		while(root!=null) {
    			stack.push(root);
    			root = root.left;
    		}
    		TreeNode node = stack.pop();
        	// 判断哈希表中是否存在 `k - val`
        	if(set.contains(k-node.val)) {
        		return true;
        	}
        	set.add(node.val);
        	root = node.right;
    	}
    	return false;
    }
}
