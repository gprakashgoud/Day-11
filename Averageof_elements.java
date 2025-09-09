package com.codegnan.Arrays;

public class Averageof_elements {
	public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5 };
	double sum=0;
	for(int num:arr)
	{
		sum += num;
	}
	double avg = sum / arr.length;
	System.out.println(avg);
}

}


