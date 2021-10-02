
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	int l = 0; 
        int r = n - 1; 
        int c = 1; 
        
        while(l <= r) { 
            if(c % 2 == 1) { 
                arr[l] = c; 
                c += 1; 
                l += 1; 
            } 
            
            else { 
                arr[r] = c; 
                c += 1; 
                r -= 1; 
            } 
        }
 }
}
