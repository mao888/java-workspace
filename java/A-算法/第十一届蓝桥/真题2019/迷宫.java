package 真题2019;
//深搜时计算下每个位置的步数，避免重复经过
import java.util.Scanner;
//DDDDRRURRRRRRDRRRUUURRDDDLDDDLDDRDDDDDDDDDDDDRDDRRRUUURRUUUUURUURUUUURURRDDDRRRDDDRDDLDLDDDDDDLDDRRURDDDRURURRDDDRRRRUURUUUUUUUULLLUUUURRRRUUULDLLUUUULLUUULUURRDRRUUURURRRDDRRRRRDDRRDDLLLDDRRDDRDDLDDDLLDDLLLDLDDDLDDDDDDDRRRUUUUURRRRRURDDDDDDDRR
public class 迷宫 {
	public static int endx=30,endy=50;
	public static String ans="";
	public static int [][] arr = new int[endx][endy];
	public static char [][] c = new char[endx][endy];
	public static boolean [][] buf = new boolean[endx][endy];
	public static String min(String s1,String s2){
		if(s1.length()>s2.length()){
			return s2;
		}else if(s1.length()<s2.length()){
			return s1;
		}else{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			for(int i=0;i<c1.length;i++){
				if(c1[i]>c2[i]) return s2;
				else if(c1[i]<c2[i]) return s1;
				else continue;
			}
		}
		return s1;
	}
	public static void dfs(int x,int y,String cur,int step){
		arr[x][y]=step;
		if(endx==x+1&&endy==y+1){
			ans=ans.equals("")?cur:min(ans,cur);
			return;
		}
		if(x+1>=0&&x+1<endx&&arr[x+1][y]<=step&&buf[x+1][y]==false){
			buf[x+1][y]=true;
			dfs(x+1,y,cur+"D",step+1);
			buf[x+1][y]=false;
		}
		if(x-1>=0&&x-1<endx&&arr[x-1][y]<=step&&buf[x-1][y]==false){
			buf[x-1][y]=true;
			dfs(x-1,y,cur+"U",step+1);
			buf[x-1][y]=false;
		}
		if(y+1>=0&&y+1<endy&&arr[x][y+1]<=step&&buf[x][y+1]==false){
			buf[x][y+1]=true;
			dfs(x,y+1,cur+"R",step+1);
			buf[x][y+1]=false;
		}
		if(y-1>=0&&y-1<endy&&arr[x][y-1]<=step&&buf[x][y-1]==false){
			buf[x][y-1]=true;
			dfs(x,y-1,cur+"L",step+1);
			buf[x][y-1]=false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<endx;i++){
			c[i]=sc.next().toCharArray();
			for(int j=0;j<endy;j++){
				if(c[i][j]=='1'){
					arr[i][j]=Integer.MAX_VALUE;
				}
			}
		}
		buf[0][0]=true;
		dfs(0,0,"",0);
		System.out.println(ans);
	}
}
