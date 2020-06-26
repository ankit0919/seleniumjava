package com.bst;

class Node
{
	int data;
	Node left;
	Node right;
	
}
class BST
{
	public Node createNewNode(int k)
	{
		Node a = new Node();
		a.data=k;
		a.left=null;
		a.right=null;
		return a;
	}
	public Node insert(Node node, int val)
	{
		if(node==null)
		{
			return createNewNode(val);
		}
		
		if(val<node.data)
		{
			node.left=insert(node.left,val);
		}
		else if(val>node.data)
		{
			node.right=insert(node.right,val);
		}
		return node;
		
	}
	
	public Node delete(Node node, int val)
	{
		if(node==null)
		{
			return null;
		}
		if(val<node.data)
		{
			node.left=delete(node.left,val);
		}
		else if(val>node.data)
		{
			node.right=delete(node.right,val);
		}
		else
		{
			if(node.left==null || node.right==null)
			{
				Node temp =null;
				temp=node.left==null?node.right :node.left;
				
				if(temp ==null)  //if temp is not null
				{
					return null;
				}
				else
				{
					return temp; //return the node
				}
				
				
			}else
			{
				
				
				Node successor =getSuccessor(node);
				node.data =successor.data;
				node.right= delete(node.right,successor.data);
				return node;
				
			}
		}
		return node;
	}
	
	public Node getSuccessor(Node node)
	{
		if(node==null)
		{
			return null;
		}
		Node temp=node.right;
		
		while(temp.left!=null)
		{
			temp =temp.left;
		}
		return temp;
		
	}
	
	public void inOrder(Node node)
	{
		if(node ==null)
		{
			return;
		}
		inOrder(node.left);
		System.out.println(node.data +" ");
		inOrder(node.right);
	}
	
	public void preOrder(Node node)
	 {
		 if(node==null)
		 {
			 return;
		 }
		 
		 System.out.println(node.data);
		 preOrder(node.left);
		 preOrder(node.right);
	 }
	
	public void postOrder(Node node)
	{
		if(node==null)
		{
			return ;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}
	
	public boolean ifNodePresent(Node node, int val)
	{
		boolean isPresent =false;
		if(node==null)
		{
			return false;
		}
		
		while(node!=null)
		{
			
			if(val< node.data)
			{
				node=node.left;
			}
			else if(val> node.data)
			{
				node=node.right;
			}
			else if(val==node.data)
			{
				isPresent = true;
				
				break;
			}
		}
		
		return isPresent;
	}
	public Node getParentNode(Node node, int val) {
		// TODO Auto-generated method stub
		if(node == null)
		{
			return null;
		}
		
		Node getParent = null;
		
		while(node!=null)
		{
			if(val<node.data)
			{
				getParent = node;
				node= node.left;
			}
			else if(val >node.data)
			{
				getParent = node;
				node = node.right;
			}
			else 
			{
				break;
			}
		}
		
		
	  if(node ==null)
	  {
		  return null;
	  }
	  else
	  {
		  return getParent;
		  
	  }
	}
	public Node siblingNode(Node node, int val)
	{
		if(node == null || node.data==val)
		{
			return null;
		}
		Node parentNode = null;
		while(node!=null)
		{
			if(val < node.data)
			{
				parentNode =node;
				
				node = node.left;
			}
			else if(val > node.data)
			{
				parentNode=node;
				node = node.right;
			}
			else
			{
				break;
			}
		}
		
		if(node == null)
			return null;
		
		if(parentNode.left !=null && val == parentNode.left.data)
		{
			return parentNode.right;
		}
		if(parentNode.right !=null && val == parentNode.right.data)
		{
			return parentNode.left;
		}
		
		return null;
	}
	public Node inOrderParentNode(Node node, int val) {
		if(node == null)
		{
			return null;
		}
		Node inOrderParent = null;
		
		while(node!=null)
		{
			if(val < node.data)
			{
				inOrderParent = node;
				node = node.left;
			}
			else if(val > node.data)
			{
				node = node.right;
			}
			else
			{
				break; 
			}
		}
			
		return node != null ? inOrderParent: null;
	
	}
	
	public Node getInorderSuccessor(Node node, int val)
	{
		if(node == null)
		{
			return null;
		}
		
		Node inOrderSuccessor = null;
		while(node!=null)
		{
			if(val < node.data)
			{
				inOrderSuccessor = node;
				node = node.left;
			}
			else if(val > node.data)
			{
				node = node.right;
			}
			else
			{
				if(node.right!= null)
				{
					inOrderSuccessor = getSuccessor(node);
				}
				break;
			}
		}
		if(node!=null)
		{
			return inOrderSuccessor;
		}
		else
		{
			return null;
		}
		
	}
	public int getDifferenceEvenOddLevel(Node node) {
		if(node ==null)
		{
			return 0;
		}
		
		return node.data- getDifferenceEvenOddLevel(node.left) - getDifferenceEvenOddLevel(node.right);
	}
	public int getMax(Node node) {
		// TODO Auto-generated method stub
		if(node == null)
		{
			System.out.println("Tree is Empty");
			return -1;
			
		}
		while(node.right!=null)
		{
			node = node.right;
		}
		
		return node.data;
	}
	
	public int getMin(Node node) {
		// TODO Auto-generated method stub
		if(node == null)
		{
			System.out.println("Tree is Empty");
			return -1;
			
		}
		while(node.left!=null)
		{
			node = node.left;
		}
		
		return node.data;
	}
	public int getHeight(Node node) {
		// TODO Auto-generated method stub
		if(node ==null)
		{
			return 0;
		}
		
		int lDepth = getHeight(node.left);
		int rDepth = getHeight(node.right);
		
		if(lDepth > rDepth)
		{
			return lDepth +1;
		}
		else
			return rDepth +1;
		
	}
}

 
public class BSTApp
{
	public static void main(String[] args)
	{
		BST a = new BST();
		
		Node root = null;
		
		//8,3,6,10,4,7,1,14,13
		root=a.insert(root, 8);
		
		root=a.insert(root, 3);
		
		root=a.insert(root, 6);
		root=a.insert(root, 10);
		root=a.insert(root, 4);
		root=a.insert(root, 7);
		root=a.insert(root, 1);
		root=a.insert(root, 14);
		root=a.insert(root, 13);
		//a.inOrder(root);
		//root = a.delete(root, 1);
		
		//root = a.delete(root, 3);
		//a.preOrder(root);
		/*a.postOrder(root);
		
		
		
		System.out.println(root);
		System.out.println(a.ifNodePresent(root, 3));
		
		Node parentNode=a.getParentNode(root ,3);
		
		if(parentNode!=null)
		{
			System.out.println(parentNode.data);
		}
		else
		{
			System.out.println("Parent does not exists...");
		}
		
		Node siblingNode=a.siblingNode(root ,3);
		
		if(siblingNode!=null)
		{
			System.out.println(siblingNode.data);
		}
		else
		{
			System.out.println("sibling does not exists...");
		}*/
		
		
        /*Node inOrderParentNode=a.inOrderParentNode(root ,3);
		
		if(inOrderParentNode!=null)
		{
			System.out.println(inOrderParentNode.data);
		}
		else
		{
			System.out.println("Inorder parent does not exists...");
		}
		
		
		 Node inOrderSuccessorNode=a.getInorderSuccessor(root ,6);
			
			if(inOrderSuccessorNode!=null)
			{
				System.out.println(inOrderSuccessorNode.data);
			}
			else
			{
				System.out.println("Inorder successor does not exists...");
			}*/
		

//
//         System.out.println(a.getDifferenceEvenOddLevel(root));
//         System.out.println(a.getMax(root));
//         System.out.println(a.getMin(root));
//         
         System.out.println(a.getHeight(root)-1);
		
	}
	

}
