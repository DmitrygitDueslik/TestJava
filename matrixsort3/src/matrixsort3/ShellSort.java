package matrixsort3;

import java.util.Scanner;
import java.util.Random;

public class ShellSort {
	public static boolean less(int v, int w) {
		return v < w;
	}
	public static void exch(int[] arr, int i, int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	public static void main(String[] args) {
		int sizef;
		Scanner sc=new Scanner(System.in);
		System.out.println("Введите размер массива");
		sizef=sc.nextInt();
		int[] arr=new int[sizef];
		Random rand=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(99)+1;//Начиная с единицы
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
		int N=arr.length;
		int h=1;
		while(h<N/3) {
			h=3*h+1;
		}
		while(h>=1) {
			for(int i=h;i<N;i++) {
				for(int j=i;j>=h&& less(arr[j],arr[j-h]);j-=h) {
					exch(arr,j,j-h);
				}
				
			}
			h=h/3;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}
}
