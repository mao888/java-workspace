package √¿Õ≈±  ‘;

import java.util.Scanner;

public class µ„≤À {

	static int m;
    static int[] can;
    static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        can = new int[m + 1];
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        perm(arr, 0, n - 1);
        System.out.println(max);
    }
    public static void perm(int[][] array,int start,int end) {
        if(start==end) {
            can = new int[m + 1];
            int tmp = check(array, m, can);
            max = Math.max(tmp, max);
        } else {
            for (int i = start; i <= end; i++) {
                swap(array,start,i);
                perm(array,start+1,end);
                swap(array,start,i);
            }
        }
    }
    public static void swap(int[][] array,int i,int j) {
        int[] temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int check(int[][] arr, int m, int[] can) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] < 0 || arr[i][1] > m || arr[i][0] > m || arr[i][1] < 0) continue;
            if (can[arr[i][0]] != 1 && can[arr[i][1]] != 1) {
                count++;
                can[arr[i][0]] = can[arr[i][1]] = 1;
            }
        }
        return count;
    }

}
