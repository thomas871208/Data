package tts.com;

public class Multiplication {

	public static void main(String[] args) {
		int a[][] = {{1,2},{3,4}};
		int b[][] = {{5,6},{7,8}};		
		int a_row = a.length;
		int a_col = a[0].length;
		int b_row = b.length;
		int b_col = b[0].length;
		int c[][] = new int[a_row][b_col];
		for(int i=0;i<a_row;i++) {
			for(int j=0;j<b_col;j++) {
			for(int k=0;k<a_col;k++) {
				c[i][j]=c[i][j] + a[i][k]*b[k][j];
			}
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
/*
a00*b00+a01*b01=c00=19
a00*b01+a01*b11=c01=22
a10*b00+a11*b01=c10=43
a10*b01+a11*b11=c11=50

12 56
34 78
*/