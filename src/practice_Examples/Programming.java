package practice_Examples;

import java.util.HashMap;

public class Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java is java";
		HashMap<Character,Integer>hashmap=new HashMap<>();
		char[]arr=s.toCharArray();
		for(char c:arr) {
			if(hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c)+1);
			}
			else {
				hashmap.put(c, 1);
			}
		}
		System.out.print(hashmap);
	
	}
}
