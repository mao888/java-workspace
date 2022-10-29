package ¡∑œ∞±æ;

import java.util.ArrayList;
import java.util.List;

public class List≤‚ ‘ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		int arr[] = {1,2,3,4,5,6};
		for (int i : arr) {
			list.add(i);
		}
		int size = list.size();
		list.remove(size-2);		// 1 2 3 4 6
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
