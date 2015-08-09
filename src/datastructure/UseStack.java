package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		Stack<String> stack = new Stack<>();

		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.remove(2);
		stack.push("3");
  
		Object objTop = stack.peek();
		System.out.println(objTop);
	
		for (;!(stack.isEmpty());)
				System.out.println(stack.pop());		
	}
}
