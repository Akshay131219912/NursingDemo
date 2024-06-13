package sample_Programs;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0,r,a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		
		while(no>0) {
			r=no%10;
			rev=rev*10+r;
			no=no/10;
			
			
		}
		System.out.println(rev);
		
		

	}

}
