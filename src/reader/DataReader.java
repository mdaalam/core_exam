package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DataReader {

	public static void main(String[] args) { 
		/* 
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 */

		String textFile = "/Users/mdalam/Documents/PnT/SuperSonic/src/data/becoming-a-developer.txt";

		

		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader(textFile));
			while ((line = br.readLine()) != null) { 
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}