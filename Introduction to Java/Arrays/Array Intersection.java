import java.util.*;

public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
          // int ans[];
 int m = arr1.length;
        int n = arr2.length;
     // ,n;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    for ( int i = 0; i< m ;i++)
    {
        for ( int j = 0; j<n;j++ )
        {   
           if ( arr1[i] == arr2[j] ){
               System.out.print(arr1[i] + " "); 
               arr2[j] = Integer.MIN_VALUE;
               break;
           }
              
        }
    }
 

    }
}


 
