package 练习本;

import java.util.Scanner;

public class 部分和问题 {
    static int n,k;
    static boolean[] st = new boolean[30];
    static int[] arr = new int[30];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        k = sc.nextInt();
        if(dfs(0,0)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static Boolean dfs(int i,int sum){
        if(i==n){
            return sum == k;
        }

        if(dfs(i+1,sum)) return true;
        if(dfs(i+1,sum+arr[i])) return true;
        return false;
    }
}
