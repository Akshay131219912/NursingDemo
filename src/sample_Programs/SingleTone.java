package sample_Programs;

public class SingleTone {
	private  static SingleTone instance=null;
	private SingleTone() {}
	static SingleTone instace() {
		if(instance==null) {
			return new SingleTone();
		}
		else return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubTo
		SingleTone s =new SingleTone();
		instace();

	}

}
