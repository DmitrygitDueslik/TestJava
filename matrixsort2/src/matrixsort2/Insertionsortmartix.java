package matrixsort2;

import java.util.Random;
import java.util.Scanner;

public class Insertionsortmartix {
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
	System.out.println();
	for(int i=1;i<arr.length;i++) {
		int key=arr[i];//элемент который вставляем
		int j=i-1;
			while(j>=0 &&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
		arr[j+1]=key;
	}
	 for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
     }
	}
}
