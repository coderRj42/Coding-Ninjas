
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
    	
            for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]  && (i != j))  
                     return (arr[j]);  
            }  
        }
        return -1;
    }
}
