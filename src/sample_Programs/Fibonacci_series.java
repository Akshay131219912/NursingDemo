package sample_Programs;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,firstTerm=0,LastTerm=1,nextterm,n=10;
		
		while(i<=n) {
			System.out.println(firstTerm);
			nextterm=firstTerm+LastTerm;
			firstTerm=LastTerm;
			LastTerm=nextterm;
			i++;
		}
	}

}
