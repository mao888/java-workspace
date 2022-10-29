package 泛型与容器;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	static class Fater {
		public void Call() {
			System.out.println("我是父亲");
		}
		
	}
	
	static class Son extends Fater{
		public void Call() {
			System.out.println("我是孩子");
		}
		public void play() {
			System.out.println("孩子特有");
		}
	}
	
	
	public static void main(String[] args) {
//		List<? extends Object> l1 = new ArrayList();
//		List<Integer> l1 = new ArrayList();
//		l1.add(123);
//		l1.get(0);
//		List<Integer> l1 = new ArrayList();
//		ArrayList<Integer> l2 = new ArrayList();
		// List 2func l1
		// ArrayList 3func 2继承的 l2 
//		System.out.println(l1.getClass().getName()+"  "+l2.getClass().getName());
//		Fater f1 = new Son();
//		Son s2 = new Son();
//		f1.Call();
//		s2.Call();
		
		
	}
}
