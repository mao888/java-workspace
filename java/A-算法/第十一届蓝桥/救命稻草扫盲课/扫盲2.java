package ¾ÈÃüµ¾²İÉ¨Ã¤¿Î;

public class É¨Ã¤2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Ñî»ÔÈı½Ç
	int a[][]=new int[10][10];
	a[1][1] = 1;
	for (int i = 2; i < 10; i++) {
		for (int j = 1; j < 10; j++) {
			a[i][j]=a[i-1][j] + a[i-1][j-1];
		}
	}
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			if (a[i][j]==0) continue;
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
		
	}

}
