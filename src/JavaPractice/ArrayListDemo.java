package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("chakri");
		al.add("2");
		al.add("chakra");
		al.add("Anantapur");
		
		
		
	/*	for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		
	/*	for(Object e:al) {
			System.out.println(e);
		}*/
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		int[] a= {1,2,3,4,5};
		List arr = Arrays.asList(a);
		System.out.println(arr);
		arr.add(6);
		System.out.println(arr);
		
		
		

	}

}
