package 决策数后端测试;

public class 回文字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		System.out.println(isStr(s));
	}
	
	 public static boolean isStr (String str) {
	        if (str.length()==0) {
				return false;
			}
	        return str.equals(new StringBuilder(str).reverse().toString());
	    }

    

}
