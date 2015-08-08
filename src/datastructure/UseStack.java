package datastructure;

import java.lang.reflect.Array;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		int temp=0;
		int[] array = {5,4,3,2,1};
		for(int i=0; i<array.length-1; i++)
			for(int j=0; j<array.length-1; j++)
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
		
		for(int k=0; k<array.length;k++)
			System.out.println(array[k]);
			
	}

}
