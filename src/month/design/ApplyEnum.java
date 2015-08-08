package month.design;

public class ApplyEnum {
	/**
	 * Please design the following Feature in java.
	 */
	Month month;
	    
	public ApplyEnum(Month month) {
	        this.month = month;
	    }
	    
	public void tellItLikeItIs() {
	    switch (month) {
	        case JANUARY:
	            System.out.println("Beginig of the year");
	            break;
	                    
	        case DECEMBER:
	            System.out.println("End of the year.");
	            break;
	                        
	        case MARCH: case APRIL: case MAY: case JUNE: case JULY: case AUGUST: case SEPTEMBER: case OCTOBER: case NOVEMBER: case FEBRUARY:

	            System.out.println("Middle of the year");
	            break;
	                        
	        default:
	            System.out.println("Not a valid month!");
	            break;
	        }
	    }

	public static void main(String[] args) {
		ApplyEnum ae1 = new ApplyEnum(Month.JANUARY);
		ae1.tellItLikeItIs();
		
		ApplyEnum ae2 = new ApplyEnum(Month.APRIL);
		ae2.tellItLikeItIs();
		
		ApplyEnum ae3 = new ApplyEnum(Month.DECEMBER);
		ae3.tellItLikeItIs();
		/*
		 * Create an Enum called Month,then create a class to use that Month Enum where you
		 * will implement a method using switch...case. Once the whole use able process is done,
		 * create an object in this main method to demonstrate the Enum feature in java.
		 */

	}

}
