


public class Solution {

    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input, 0, x);
    }

    static boolean checkNumber(int a[], int SI, int x){
        if(SI>=a.length)
            return false;

        if(a[SI] == x)
            return true;
        return checkNumber(a, SI+1, x);


    }

}

