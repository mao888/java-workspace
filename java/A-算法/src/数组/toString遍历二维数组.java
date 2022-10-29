package 数组;

import java.util.Arrays;

public class toString遍历二维数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//第一种方式:
		int Arr[][]={{5,7,15},{8,4,11},{3,6,13}};
	    System.out.println("Arr:"+Arrays.toString(Arr));
	    int b[][]={{5,7,15},{8,4,11},{3,6,13}};
	    System.out.println("b:"+Arrays.deepToString(b));
	  //第二种方式；
	    //int[][] ints = new int[4][2];        
	    //ints[i][j] =__; //分别赋值
	    
	    //第三种方式：第二维的长度可以动态申请
	    int[][] arr3 = new int[5][];       //五行的长度
	    for(int i=0; i<arr3.length; ++i){      	
	        arr3[i]=new int[i+1];         //列的长度每次都变化。每次都要重新申请空间(长度)
	        for(int j=0; j<arr3[i].length; ++j){
	            arr3[i][j]= i+j;  
	            System.out.println( "arr3[i][j]:"+ arr3[i][j]);
	        }
	        
	        System.out.println( "arr3[i][j]:"+ Arrays.toString(arr3[i]) );
	    }
	}

}
