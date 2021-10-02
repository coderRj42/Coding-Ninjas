public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		   int currentFahrenhietValue = start;
    while(currentFahrenhietValue <= end)
    { int celsiusValue = (int)((5.0 / 9) * (currentFahrenhietValue - 32)); 
     System.out.println(currentFahrenhietValue +"\t" +celsiusValue); 
     currentFahrenhietValue += step;
    }

	}
}
  
  
