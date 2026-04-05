package matrixsort;


import java.util.Scanner;
import java.util.Random;
public class matrix2 {
public static void main(String[] args) {
	 int sizef;
	Scanner sc=new Scanner(System.in);
	System.out.println("Введите размер массива");
	sizef=sc.nextInt();
	int[] arr=new int[sizef];
	Random rand=new Random();
	for(int i=0;i<arr.length;i++) {
		arr[i]=rand.nextInt(99);
		System.out.print(arr[i]);
		System.out.print(" ");
	}
	for(int i=0;i<arr.length;i++) {
		int min=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}
	System.out.println();
	for(int i=0;i<arr.length;i++) {
		
		System.out.print(arr[i]);
		System.out.print(" ");
	}
	
}
}
