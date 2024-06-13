package sample_Programs;

public class LengthOfChar {

	public static void main(String[] args) {
		//Length of string without using inbuilt function
		int i=0;
		String name="Akshay";
		char[]arr=name.toCharArray();
		for(char a:arr) {
			i++;
		}
		System.out.println(i);
	}

	
}
