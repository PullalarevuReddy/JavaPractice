package JavaPractice;

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload ml=new MethodOverload();
		ml.singleName();
		ml.singleName(20);
		ml.singleName(2, "chakri");
		ml.singleName("chakri", 20);

	}
  public void singleName() {
	  System.out.println("chakri");
  }
  public void singleName(int a) {
	  System.out.println(a);
  }
  public void singleName(int a, String name) {
	  System.out.println("my age is "+a +" my name is "+name);
  }
  public void singleName(String name, int a) {
	  System.out.println(name+a);
	  
  }
}
