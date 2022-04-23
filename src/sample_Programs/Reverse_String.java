package sample_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Selenium";
		int size=s.length();
		String reverse="";
		char arr[]=s.toCharArray();
		
		for(int i=size-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
