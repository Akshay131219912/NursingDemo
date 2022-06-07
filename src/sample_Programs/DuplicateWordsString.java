package sample_Programs;

public class DuplicateWordsString {

	public static void main(String[] args) {
		Getdata("java is not java");
		

	}
	public static void Getdata(String name) {
		
		String word[]=name.split(" ");
		//for(int i=0;i<word.length;i++) {
			//System.out.println(word[i]);
		//}
		//System.out.println("string splited");
		int count;
		for(int i=0;i<word.length;i++) {
			count=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
				
			}
			if(count>1 && word[i]!="0") {
				System.out.println(word[i]);
			
			}
		}
		
	}

}
