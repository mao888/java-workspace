package Á·Ï°±¾;

public class ´òÓ¡Ñî»ÔÈý½Ç {
/**
 * 	1	0	0	0	0
 * 	1	1	0	0	0
 * 	1	2	1	0	0
 * 	1	3	3	1	0
 * 	1	4	6	4	1
 * */	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows =5;
		int arr[][] = new int[numRows][numRows]; 
		for (int i = 0; i < arr.length; i++) {
    		arr[i][0] = 1;
    		arr[i][i] = 1;
		}
    	for (int i = 2; i < numRows; i++) {
    		for (int j = 1; j <i; j++) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[i].length;j++) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
	}

}
