package lab1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator cal = (float a, float b) -> {if (a>b) return a+b; else return 1-b;};
		
	    long startTime = System.nanoTime();
		System.out.println("Result: " + cal.add(10,20));
		  long endTime = System.nanoTime();

          System.out.println("Time taken for string concatenation using + operator : "

                                          + (endTime - startTime)+ " nano seconds");

          
          Calculator cal2 = new Calculator()
        		  {
        	   public float add(float a, float b)
        	   {
        		   if (a>b) return a+b; else return 1-b;
        	   }
        		  };
          
      	
  	    long startTime2 = System.nanoTime();
  		System.out.println("Result: " + cal2.add(10,20));
  		  long endTime2 = System.nanoTime();

            System.out.println("Time taken for string concatenation using + operator : "

                                            + (endTime2 - startTime2)+ " nano seconds");
	}

}
