package sba4;
//Write a program to take an integer array from the user and give the user a choice to sort using bubble sort (or) selection sort.
//Sort the array elements according to the selected algorithm of the user and display the sorted array.

import java.util.Scanner;

import day16Assignment.Assignment1;

public class Ques1 {
	void bubbleSort(int arr[])
	{ 
	System.out.println("bubble sorting started");
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}}
	}

	void bubbleprint(int arr[]) {
	System.out.println("bubble Sorted array :");
	
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		
	}

	void selectionsort(int arr[])
	{  	
		System.out.println("selection sorting started");	
		int n =arr.length; 
		for (int i =0; i<n-1; i++) 
		{
			int min_idx=i;
			for (int j=i+1; j<n;j++) 
				{
					if (arr[min_idx]>arr[j])
					min_idx=j;
			}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;

		}}

	void selectionprint(int arr[]) {
	 System.out.println("selection Sorted array");
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number of elements");
	    int n=sc.nextInt();
	    int [] arr=new int[n];
	    System.out.println("enter the numbers");
	    for(  int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	   
	   System.out.println("enter the mode of sorting :either press '1' for bubble sort or '2' for selection sort");
	   int a=sc.nextInt();
	   Ques1 ob=new Ques1();
	   if(a==1) 
	   {
	   ob.bubbleSort(arr);
	   ob.bubbleprint(arr);
	   }
	  else{
		  ob.selectionsort(arr);
		  ob.selectionprint(arr);
	  }
}

}
