package sample_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("akshay");
		ls.add("amit");
		ls.add("raj");
		ls.add("soham");
		ls.add("sujit");
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i).toString());
		}
		long a=ls.stream().filter(s->s.startsWith("s")).count();
		System.out.println(a);
		List<String>ls1=Arrays.asList("akshay","ajit","suraj","Raj");
		ls1.stream().filter(s->s.startsWith("a")).sorted().forEach(s->System.out.println(s));
		

	}

}
