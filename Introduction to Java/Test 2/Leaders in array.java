public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        
        int size = input.length;
		  
        for (int i = 0; i < size; i++)  
        { 
            int j; 
            for (j = i + 1; j < size; j++)  
            { 
                if (input[i] < input[j]) 
                    break; 
            } 
            if (j == size)  
                System.out.print(input[i] + " "); 
        
    } 
	}
	
}
