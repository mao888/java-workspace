package Demo;

public class jiajia_jianjian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b,c,d,e,f,g,h;
		b=a++;
		c=++a;
		d=a--;
		e=--a;
		f=++a - a++;
		g=a-- + a++;
		h=++a - ++a;
		System.out.println(b);	//1
		System.out.println(c);	//2
		System.out.println(d);	//1
		System.out.println(e);	//0
		System.out.println(f);	//2
		System.out.println(g);	//3
		System.out.println(h);	//0
	}

}
