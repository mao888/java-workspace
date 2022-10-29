package 美团笔试;

import java.util.Scanner;

public class 乘积为正 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fu = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) {
                fu[i] = fu[i - 1];
            } else {
                fu[i] = fu[i - 1] + 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if ((fu[j] - fu[i]) % 2 == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}