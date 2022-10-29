package 面向对象;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
	this.name = name;
	}
	
	//get set 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void put() {
		System.out.println(name);
	}
	
	
	
}
