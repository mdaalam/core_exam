package datastructure;

import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> arrayList = new LinkedList<String>();
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
