package Java2021∑¢œ÷±≠;

import java.util.Scanner;

public class MainBHuChao {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int jishu=0;
        int sum=100;
        for (int i = n; i <= n*100; i++) {
            if((i%n)!=0){
                jishu++;
            }
        }
        sum = sum+jishu;
//      System.out.println("jishu: "+jishu);
        System.out.println(sum);
        
    }
}