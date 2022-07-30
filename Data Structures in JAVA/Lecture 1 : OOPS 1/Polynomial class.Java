 

public class Polynomial {

    private int coff[];
	static int indexDegree=0;
    static int indexCoeff=0;
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    
    Polynomial(){
        coff = new int[5];
    }
    
    Polynomial(int[] coeff){
    coff = coeff;
    }
    
	public void setCoefficient(int degree, int coeff){
		while(degree >= coff.length)
            coff = restructure(coff);
        coff[degree] = coeff;	
	}
	
    private static int[] restructure(int coff[]){
        int temp[] = coff;
        coff = new int[2*coff.length];
        for(int i=0;i<temp.length;i++)
            coff[i]=temp[i];
        return coff;
    }
    
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0;i<coff.length;i++){
            if(coff[i] != 0)
                System.out.print(coff[i] + "x" + i+" ");
        }
       // System.out.println();
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		if(coff.length<p.coff.length){
            for(int i=0;i<coff.length;i++)
                coff[i] += p.coff[i];
        }
        else{
            for(int i=0;i<p.coff.length;i++)
                coff[i] += p.coff[i];
        }
        p.coff = coff;
		return p;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        if(coff.length<p.coff.length){
            for(int i=0;i<coff.length;i++)
                coff[i] -= p.coff[i];
        }
        else{
            for(int i=0;i<p.coff.length;i++)
                coff[i] -= p.coff[i];
        }
        p.coff = coff;
        return p;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
        
        int mul_arr[] = new int[5];
        int k=0;
		for(int i=0;i<p.coff.length;i++){
            for(int j=0;j<coff.length;j++){
                while((i+j)>=mul_arr.length)
                    mul_arr=restructure(mul_arr);
                mul_arr[i+j] += p.coff[i]*coff[j];
            }
        }
        p.coff = mul_arr;
        return p;
	}
    
    
//     public Polynomial multiply(Polynomial p)
//     {
// 		int size=this.arr.length+p.arr.length-1;
//             Polynomial p3=new Polynomial();
//         p3.arr=new int[size];
//         for(int i=0;i<this.arr.length;i++){
//             for(int j=0;j<p.arr.length;j++){
//                 p3.arr[i+j]+=p.arr[j]*(this.arr[i]);
//             }
//         }
//         return p3;
// 	}
    

}
