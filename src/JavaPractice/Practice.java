package JavaPractice;

public class Practice {

	public static void main(String[] args) {
	String s= "Welcome to Synechron Interview";
	 String[] words = s.split(" ");
	 for(String word:words) {
		 if(word.equalsIgnoreCase("Synechron")) {
			 System.out.println(word);
		 }
	 }
	
		
	
	
	
	

	}

}
