package 面向对象;
//Java中普通代码块，构造代码块，静态代码块区别及代码示例
//执行顺序：（优先级从高到低。）静态代码块>main方法>构造代码块>构造方法。
//其中静态代码块只执行一次。构造代码块在每次创建对象是都会执行。
class Code{
    {
      System.out.println("Code的构造块");
    }

    static{
        System.out.println("Code的静态代码块");
        }

    public Code(){
        System.out.println("Code的构造方法");
        }
    }
public class CodeBlock03 {
	 {
	      System.out.println("CodeBlock03的构造块");    
	     }

	     static{
	        System.out.println("CodeBlock03的静态代码块");
	        }

	        public CodeBlock03(){
	             System.out.println("CodeBlock03的构造方法");
	            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("CodeBlock03的主方法");
         new Code();
         System.out.println("------------");
         new Code();
         System.out.println("------------");
         new CodeBlock03();
         System.out.println("------------");
         new CodeBlock03();
         System.out.println("------------");
	}

}
