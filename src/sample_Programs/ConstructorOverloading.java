package sample_Programs;

public class ConstructorOverloading {
	static void play() {
		System.out.println("static");
		
	}
	public ConstructorOverloading() {
		System.out.println("default");
	}
	
	public ConstructorOverloading(int n) {
		System.out.println(n);
	}

	public static void main(String[] args) {
		play();
		ConstructorOverloading c = new ConstructorOverloading();
		ConstructorOverloading c1 = new ConstructorOverloading(12);
		

	}

}
