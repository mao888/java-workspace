package 剑指OfferII专项突击版;

public class OfferII072求平方根之二分 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(8));
	}
	
    public static int mySqrt(int x){
        int left = 0, right = x;
        while (left < right){
            // 为了防止 mid 为 0 , 在后面加1
            int mid = left + (right - left) / 2 + 1;
            // 通过除法 x/mid 来判断比用乘法好, 乘法容易溢出
            if(x/mid >= mid){
                // 由于 x 的平方根是向下取整的, 所以当 x/mid >= mid, 也就是 mid^2 <= x, 
                // 有可能 mid 就是平方根, 所以 left = mid, 而不是 mid + 1
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }


}
