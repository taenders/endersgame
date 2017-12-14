import java.util.Scanner;
import javax.swing.tree.TreeNode;

public class BinarySearchTree {

	static class TreeNode {
		int data; 
		TreeNode left; 
		TreeNode right; 
		TreeNode(int d) {data = d; left = null; right = null;} 
		
	}
	
	
	static TreeNode createMinimalBST(int[] array) {
		return createMinimalBST(array, 0, array.length -1); 
	}
	
	static TreeNode createMinimalBST(int[] array, int start, int end) {
		if (end < start) {
			return null; 
		}
		int mid = (start + end) /2; 
		TreeNode n = new TreeNode(array[mid]); 
		System.out.println("Creating new root with value" + n.data);
		n.left = createMinimalBST(array, start, mid-1); 
		n.right = createMinimalBST(array, mid + 1, end); 
		return n; 
	}
	
		static void printList(TreeNode root) {
    		if(root == null) {
    			return; 
    		}
    		else {
    		printList(root.left); 
    		System.out.print(root.data);
    		printList(root.right); 
    			
    		}
	}
		
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in); 
	System.out.println("Input the size of your array: ");
	int arraySize = reader.nextInt(); 
	int[] intArray = new int[arraySize]; 
	for (int x=0; x<arraySize; x++) {
		System.out.println("Next number: "); 
		int nextNum = reader.nextInt(); 
		intArray[x] = nextNum; 
	}
	printList(createMinimalBST(intArray)); 
		
	}
}
