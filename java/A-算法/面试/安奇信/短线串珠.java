package °²ÆæĞÅ;

public class ¶ÌÏß´®Öé {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][]{{0,0},{0,2},{1,1},{10,10}};
		System.out.println(getMinLength(arr));
	}
	
    public static int getMinLength (int[][] pearls) {
        // write code here
//    	int erWeiLen = pearls.length;
    	
    	int arr1[] = new int[2];
    	int arr2[] = new int[2];
    	int arr3[] = new int[2];
    	int arr4[] = new int[2];
    	
		arr1 = pearls[0];
		int x1 = arr1[0];
		int y1 = arr1[1];
		
		arr2 = pearls[1];
		int x2 = arr2[0];
		int y2 = arr2[1];
		
		arr3 = pearls[2];
		int x3 = arr3[0];
		int y3 = arr3[1];
		
		arr4 = pearls[3];
		int x4 = arr4[0];
		int y4 = arr4[1];
		
		int length1 = Math.abs(x2-x1)+Math.abs(y2-y1);
		int length2 = Math.abs(x3-x2)+Math.abs(y3-y2);
		int sum = length1+length2;
		return sum;
    }
}
