package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on given range.
		 * 
		 */

        int limit = 100000000;
       
        System.out.println("Prime numbers between 1 and " + limit);

        for(int i=1; i < limit; i++){
                boolean isPrime = true;
                for(int j=2; j < i ; j++){
                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.println(i + " ");
        }
	}
}
