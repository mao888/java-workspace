package 剑指OfferII专项突击版;

import java.util.HashMap;
import java.util.Map;

public class OfferII056二叉搜索树中两个节点之和之Map {

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
        Map<Integer, Integer> map = new HashMap<>();
        if (root == null) {
			return false;
		}
        map.get(root);
        int val = root.val;
        if(map.containsKey(k-val)) {
        	return true;
        }
        map.put(val, k-val);
        findTarget(root.left, k);
        findTarget(root.right, k);
    	return true;
    }

}
