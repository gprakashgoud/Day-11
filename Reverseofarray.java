package com.codegnan.Arrays;

public class Reverseofarray {

	public static void main(String[] args) {
    int [] arr= {1,2,3,4,5};
     System.out.println("Original array:");
     printArray(arr);
     reverseArray(arr);
     System.out.println("Reversed array;");
     printArray(arr);
	}
	public static void reverseArray(int[] arr) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
			
		}
     }
	public static void printArray(int[] arr) {
		for(int num:arr) {
			System.out.println(num);
		}
		System.out.println();
		
	}

}
