package com.bst;


	import java.util.*;
	import java.io.*;

	

	class Solution {
		int lDepth=0;
	    int rDepth=0;
		public static int height(Node root)
	    {
	        if(root == null)
	        {
	            return -1;
	        }
	        else
	        {
	        	 return 1 + Math.max(height(root.left), height(root.right)); 
	        }

	       
	       
	    } 
	    

	
	
	public static Node insert(Node root, int data) {
        if(root == null) {
            return null;
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
        
        // Comment modified please check it 
    }	
}


