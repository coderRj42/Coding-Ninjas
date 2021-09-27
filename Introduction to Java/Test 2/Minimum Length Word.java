
public class Solution {
	
	public static String minLengthWord(String str){
		
		// Write your code here
// String res="";
//         String ans="";
//         int i=0;
//         int j=0;
//         int max=input.length();
//         int count=0;
//         while(i<input.length()){
// 	while(i<input.length())
//         i++;
//     }
//         j=i;
//         while(i<input.length()){
//             i++;
//         }
//         res=input.substring(j,i);
//         count=res.length();
//         if(max>count){
//             ans=res;
//             max=count;
//         }
//         return ans;
//         }
    
    String input[] = str.split(" ");
        int mini = input[0].length();
        String s = "";
    for(int i=1; i<input.length; i++){
      	int l = input[i].length();  
        
        if(mini > l){
            mini = l;
            s = input[i];
        }
        
   	 }
        
        
        
    return s;
    
    } 
}
