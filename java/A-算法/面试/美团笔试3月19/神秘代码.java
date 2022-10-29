package 美团笔试3月19;
import java.util.*;
public class 神秘代码 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int t = sc.nextInt();
         String s1 = sc.next();
         String result = "";
         if(t==1){
        	 result=  encrypt(s1,n);
         }else{
        	 result=  decrypt(s1,n);
         }
       System.out.println(result);
        
    }
    
    private static String encrypt(String s1,int n){
        String result = "";
        StringBuilder sb = new StringBuilder(s1);
		for(int i = n;i>0;i--){
            int index = i%2==0?i/2:i/2+1;
            index = index -1;
            result = result + sb.charAt(index);
            sb = sb.deleteCharAt(index);
        }
        return result;
        
    }
    
   public static boolean flag = false;
    private static String decrypt(String s1,int n){
        String result = "";
        for(int i= 0 ;i<n;i++){
            if(flag) result = result +  s1.charAt(i);
            else result =  s1.charAt(i)+result;
            flag = !flag;
        }
        return result;
    }

}
