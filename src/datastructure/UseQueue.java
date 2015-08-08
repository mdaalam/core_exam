package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		//Queue queue = new LinkedList();
		Queue<String> queue = new LinkedList<>();
		queue.add("alam");
		queue.add("isabela");
		queue.add("kashifa");
		queue.add("asif");
		queue.remove(3);
	
		
		 for (String value : queue) {
			   System.out.println("Value = " + value);
		 }
	}

}
