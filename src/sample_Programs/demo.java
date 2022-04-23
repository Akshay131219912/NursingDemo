package sample_Programs;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,4,56,44,76};
		int largest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
				
			}
			
		}
		System.out.println(largest);

		
	
	}

}
