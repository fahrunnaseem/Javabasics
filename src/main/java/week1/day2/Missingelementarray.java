package week1.day2;

import java.util.Arrays;

public class Missingelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		int length = arr.length;
		System.out.println(length);
		
		for(int i=arr[0]; i>=length; i++) {
			System.out.println(arr[i]);
		}

	}

}