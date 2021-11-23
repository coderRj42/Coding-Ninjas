
public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
    
        
/*
 class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
} */
 
         while(head.next!=null){
             if(head.next.next!=null){
             head.next=head.next.next;
             head=head.next;
             }else{
                 head.next=null;
      
	}
}
        
        
        
        
        
    }
}
