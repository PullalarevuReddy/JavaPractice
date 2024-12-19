package JavaPractice;

public class Demo {

	public static void main(String[] args) {
 //Statement which are going give exception must right inside try block
		//when we will get exception then catch block will execute
		//finally block is independent executable block without depending upon exception
		//finally block also set of statement which are to be executed without depending upon exception like.
		//
	try {
		int a=10/0;
		System.out.println(a);
	}
		catch(Exception e) {
			System.out.println(e);
		}
	

	}

}
