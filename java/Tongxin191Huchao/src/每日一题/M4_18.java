package 每日一题;

public class M4_18 {

	String str = "good";
	char []ch = {'a','b','c'};
	
	public void change(String str,char ch[]) {
		str ="test ok";
		ch[0] ='g';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M4_18 ex = new M4_18();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str+"and");
		System.out.println(ex.ch);
	}

}
