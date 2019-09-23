package com.seaching.algorithm;

import java.util.Arrays;

/**
 * The Class binarySearch.
 */
public class binarySearch {
	
	
	/**
	 * B search.
	 *
	 * @param arr the arr
	 * @param find the find
	 * @return the int
	 * 
	 * 1) Make a subset of arr
	 * 2) first is Zero
	 * 3) last is the size of the Array List
	 * 4) Mid = last/2
	 * 
	 * 
	 */
	public static int bSearch(int arr[], int find) {
		int first = 0;
		int last = arr.length;
		int mid = last/2;
		
		System.out.println(Arrays.toString(arr));
		if(arr[mid] == find) {
			return arr[mid];
		} else if(first < last -1) {
			if(arr[mid] > find) {
				return bSearch(Arrays.copyOfRange(arr, 0, mid), find);
			} else {
				return bSearch(Arrays.copyOfRange(arr, mid+1, last), find);
			}
		}
		else  {
			return -999;
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		 int arr[] = {2,3,4,10,40,50,60,70,80,81}; 
		 int find = 3;
		 if(bSearch(arr, find) != -999) {
			 System.out.println("Found the number " + find);
		 } else {
			 System.out.println("Not found the number " + find);
		 }
	}

}
