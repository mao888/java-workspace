package Leetcode;

public class L733ÕºœÒ‰÷»æ÷Æ…ÓÀ— {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]image = {{1,1,1},{1,1,0},{1,0,1}};
		int sr = 1, sc = 1 ,newColor = 2;
		System.out.println(new L733ÕºœÒ‰÷»æ÷Æ…ÓÀ—().floodFill(image, sr, sc, newColor));
	}
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    	
    	return dfs(image, sr, sc, newColor, image[sr][sc]);
    }
    
    public int[][] dfs(int[][] image,int i,int j,int newColor,int num){
    	if(i<0||i>=image.length||j<0||j>=image[0].length||image[i][j]==newColor||image[i][j]!=num) {
    		
    	}else {
			int temp = image[i][j];
			image[i][j] = newColor;
			dfs(image, i-1, j, newColor, temp);
			dfs(image, i, j-1, newColor, temp);
			dfs(image, i+1, j, newColor, temp);
			dfs(image, i, j+1, newColor, temp);
    	}
    	return image;
    }

}
