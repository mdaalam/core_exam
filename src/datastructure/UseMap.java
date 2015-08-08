package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Use nested Map. Map<String, List<string>> list = new HAshMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("alam");
		arrayList.add("isabela");
		arrayList.add("kashifa");
		arrayList.add("asif");
		arrayList.remove(3);
		
		Map<String, ArrayList<String>> list = new HashMap<>();
	
		list.put("alam", arrayList);	
		 for (String value : arrayList) {
			   System.out.println("Value = " + list);
		 }
	}
}
