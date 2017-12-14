import java.util.Scanner;


public class BinaryPractice {

static class Node {
	int data; 
	Node left; 
	Node right; 
}
	
static void addNode(Node newNode) {
	Node root = new Node(); 
	 if(newNode.left == null && newNode.right == null) {
		 root = newNode; 
	 }
	 //else
		
			
		}

static void preOrder(Node root) {
	if(root != null) {
		System.out.print(root.data + " ");
		preOrder(root.left); 
		preOrder(root.right); 
	}
}
	
	

public static void main(String[] args) {
	Scanner reader = new Scanner(System.in); 
	System.out.println("How many nodes on the tree: "); 
	int x = reader.nextInt(); 
	Node newNode = new Node(); 
	for(int start=0; start<x; start++) {
		System.out.println("Next number: ");
		int y = reader.nextInt(); 
		newNode.data = y; 
		preOrder(newNode); 
		}
	}
}
