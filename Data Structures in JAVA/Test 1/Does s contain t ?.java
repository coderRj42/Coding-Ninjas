 
public class Solution {
    
    public static boolean isSubSequence(String str1, String str2, int m, int n) 
    { 
        // Base Cases 
        if (m == 0)  
            return true; 
        if (n == 0)  
            return false; 
              
        // If last characters of two strings are matching 
        if (str1.charAt(m-1) == str2.charAt(n-1)) 
            return isSubSequence(str1, str2, m-1, n-1); 
  
        // If last characters are not matching 
        return isSubSequence(str1, str2, m, n-1); 
    } 
    
    
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
    // if (a.length()==0)
    //     return true;
        int m=a.length();
        int n=b.length();
        return isSubSequence(b,a,n,m);
        
	}
}
