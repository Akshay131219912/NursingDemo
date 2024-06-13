package sample_Programs;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,5,2,6,1,3,2,3};
		int a=arr.length;
		
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
