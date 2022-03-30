package day16;

import java.util.Scanner;

public class Selectsortt {

	void sort(int arr[])
	{  			
		int n = arr.length;
		for (int i = 0; i < n-1; i++) 
		{
			int min_idx = i;//
			for (int j = i+1; j < n; j++) 
				{
					if (arr[min_idx] > arr[j])
					min_idx = j;//5
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;

		}

	}

	// Prints the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int i;
    System.out.println("enter the number of elements");
    int n=sc.nextInt();
    int [] arr=new int[n];
    
    System.out.println("enter the numbers");
    for( i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
	Selectionsort ob = new Selectionsort();

	ob.sort(arr);
	System.out.println("Sorted array");
	ob.printArray(arr);
}

}
