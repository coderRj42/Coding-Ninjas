  public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root)
    {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(root==null)
            return null;
         if(root.children.size()==0)
             return null;
        TreeNode<Integer> curr = root;
        for(int i=0;i<root.children.size();i++)
        {
         	TreeNode<Integer> child = root.children.get(i);
            if(child.children.size()==0){
                root.children.remove(child);
                i--;
            }
            
        }
        for(int i=0;i<root.children.size();i++)
        {
            TreeNode<Integer> child = removeLeafNodes(root.children.get(i));
            if(child==null)
                root.children.remove(child);
        }
       
        return root;
        }
}
