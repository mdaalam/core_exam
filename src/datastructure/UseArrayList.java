package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("alam");
		arrayList.add("isabela");
		arrayList.add("kashifa");
		arrayList.add("asif");
		arrayList.remove(3);
		
		System.out.println(arrayList.get(1));
		
		 for (String value : arrayList) {
			   System.out.println("Value = " + value);
		 }
	}
}
