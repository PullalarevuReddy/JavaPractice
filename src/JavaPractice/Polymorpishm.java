package JavaPractice;

public class Polymorpishm {
	


	public static void main(String[] args) {
		int[] arr={28,3,15,9,17,4,23,2};
		
		int max=arr[0];
		int second=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<max) {
				max=arr[i];
				
			}
		}

		System.out.println(max);
		
		

	}

}
