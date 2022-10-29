package Âå¹È;

import java.util.Scanner;
public class P3741honokaµÄ¼üÅÌ2whp {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        String s = sc.next();
        System.out.println(jianpan(s,i));
    }
    public static int jianpan(String s,int i){
        char[] chars = s.toCharArray();
        int count = 0;
        if (i<=1) {return 0;}
        if (i==2&&chars[0]=='K'&&chars[1]=='V'){return 0;} else if (i==2) return 1;
        int count1 = 0;

        for (int j = 0; j <s.length()-1; j++) {
            if (chars[j]=='V'&&chars[j+1]=='V'&&chars[j+2]=='V'){
                chars[j+1] = 'K';
                break;
            }else if (chars[j]=='K'&&chars[j+1]=='K'&&chars[j+2]=='V'){
                chars[j]='V';
                break;
            }
            else if (chars[j]=='K'&&chars[j+1]=='K'&&chars[j+2]=='K'){
                chars[j+1]='V';
                break;
            }
            else if (chars[j]=='K'&&chars[j+1]=='V'&&chars[j+2]=='V'){
                chars[j+2]='K';
                break;
            }

        }
        for (int j = 0; j <chars.length-1 ; j++) {
            if (chars[j]=='V'&&chars[j+1]=='K'){
                count++;
            }
        }
        return count;
    }
}