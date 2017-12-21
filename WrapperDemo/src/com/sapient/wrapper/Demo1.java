package com.sapient.wrapper;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		String[] arr = new String[2];
		arr[0] = "ram";
		arr[1] = "sam";
		
		System.out.println(arr[1]);
		
		Arrays.sort(arr, Collections.reverseOrder());
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int res = Arrays.binarySearch(arr, "sam");
		System.out.println(res);
		
		
	}

}
