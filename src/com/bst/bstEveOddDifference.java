package com.bst;



 
public class bstEveOddDifference
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
				
		
		
		    System.out.println(a.getDifferenceEvenOddLevel(root));
		    
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
			
		
		
		
	}
	

}
