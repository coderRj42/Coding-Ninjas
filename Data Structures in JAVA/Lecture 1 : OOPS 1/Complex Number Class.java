
public class ComplexNumbers {
	private int rel;
    private int img; 
    ComplexNumbers(int rel, int img){
        this.rel = rel;
        this.img = img;
    }
    
    public void plus(ComplexNumbers c){
        rel += c.rel;
        img += c.img;
    }
    
    public void multiply(ComplexNumbers c){
        int rel_temp = rel*c.rel - img*c.img;
        int img_temp = img*c.rel + rel*c.img;
        rel = rel_temp;
        img = img_temp;
    }
    
    public void print(){
        if(img>0)
            System.out.println(rel+" + i"+img);
        else if(img<0)
            System.out.println(rel+" - i" +(img*-1) );
        else
            System.out.println(rel);
    }
	
}
