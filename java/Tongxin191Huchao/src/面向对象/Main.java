package 面向对象;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person  p1 = new Person();
		Person  p2 = new Person("huhcao");
		
		p1.put();
		p2.put();
		
		p1.setName("zhang");
		
		System.out.println(p1.getName());
		
	}

}
