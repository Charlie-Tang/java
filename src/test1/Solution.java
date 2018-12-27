//package test1;
//
//import javax.swing.tree.TreeNode;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;
//public class Solution
//{  
//	//思路：二叉搜索树的中序遍历就是按顺序排列的，所以，直接中序查找就可以了
//	int index=0;	
//	TreeNode KthNode(TreeNode pRoot, int k) 
//	{		
//		if(pRoot!=null)
//		{		
//			TreeNode left=KthNode(pRoot.left, k);	
//			if(left!=null)		
//				return left;	
//			index++;		
//			if(index==k)		
//				return pRoot;	
//			TreeNode right=KthNode(pRoot.right, k);		
//			if(right!=null)			
//				return right;	
//			}	
//		return null;     
//		}
//}
//
//
//
