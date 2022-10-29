package 数组;

public class foreach遍历二维数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[][]= {{5,7,15},{8,4,11},{3,6,13}};
		System.out.println("数组中的元素是 ");
		int i=0;
		for(int x[]: Arr) {//行
			i++;
			int j=0;
			for(int e:x) {//列
				j++;
				if(i==Arr.length&&j==x.length) {
					System.out.print(e);//输出最后一个元素，后面不加逗号
				}else
					System.out.print(e+"、");
			}	
		}		
								
		
	}
}
