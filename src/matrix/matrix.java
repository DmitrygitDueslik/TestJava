package matrix;
import java.util.Random;
public class matrix {
public static void main(String[] args) {
	int[][] mat=new int[5][5];
	Random rand=new Random();
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat[i].length;j++) {
			mat[i][j]=rand.nextInt(10);
		}
	}
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat[i].length;j++) {
			System.out.print(mat[i][j]);
			System.out.print(" ");
		}
		System.out.println();
	}
	for(int i=1;i<mat.length;i++) {
		for(int j=0;j<i;j++) {
			int temp=mat[i][j];
			System.out.print(temp);
			System.out.print(" ");
		}
		System.out.println();
	}
	
}
}
