  import java.util.ArrayList;


public class solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here
return CheckCousins( root,p,q); 

	}public static int Depth(BinaryTreeNode<Integer>root,int num)
{
	if(root==null)
	{
		return 0;
	}
	if(root.data==num)
	{
		return 1;
	}

	int leftans=Depth(root.left,num);
	if(leftans!=0)
	{
		return leftans+1;
	}
	int rightans=Depth(root.right,num);

	if(rightans!=0)
	{
		return rightans+1;
	}
	return 0;
}
public static int ParentNodeData(BinaryTreeNode<Integer>root,int num)
{
	if(root==null)
	{
		return 0;
	}
	if(root.left!=null) 
	{
		if(root.left.data==num)
		{
			return root.data;
		}
	}
	if(root.right!=null) 
	{
		if(root.right.data==num)
		{
			return root.data;
		}
	}
	int leftdata=ParentNodeData(root.left,num);
	if(leftdata!=0)
	{
		return leftdata;
	}
	int rightdata=ParentNodeData(root.right,num);
	if(rightdata!=0)
	{
		return rightdata;
	}

	return 0;
}
public static boolean CheckCousins(BinaryTreeNode<Integer> root,int num1,int num2) 
{
	if(root==null)
	{
		return false;
	}

	int depth1=Depth(root,num1);
	int depth2=Depth(root,num2);
	if(depth1!=depth2) 
	{
		return false;
	}
	int ParentNodeData1=ParentNodeData(root,num1);
	int ParentNodeData2=ParentNodeData(root,num2);


	if(ParentNodeData1!=ParentNodeData2)
	{
		return true;
	}
	else
	{
		return false;
	}
}
    
}
