package sample_Programs;

public class ComparisionString {

	public static void main(String[] args) {
		String p="HELLO SELENIUM";
		String q="hello selenium";
		if(p == q) {
			System.out.println("P and q are equal string");
			}
		else {
			System.out.println("P and q are not equal string");
		}
		
		if(p.equalsIgnoreCase(q)) {
			System.out.println("P and q are equal string");
			}
		else {
			System.out.println("P and q are not equal string");
		}
	}

}
