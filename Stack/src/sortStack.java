import java.util.Scanner;
import java.util.Stack;

public class sortStack {

public static Stack<Integer> letsSortStack(Stack<Integer> n) {
	Stack<Integer> tempStack = new Stack<Integer>(); 
	int tmp = 0; 
	tempStack.push(n.peek()); 
	while(!n.isEmpty()) {
	if(n.peek() < tempStack.peek()) {
		 tempStack.push(n.peek()); 
		}
	else { 
		tmp = n.pop();
		}
	}
	return tempStack; 
}
	
	
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in); 
	System.out.println("Input how many values in the stack: ");
	Stack<Integer> myStack = new Stack<Integer>(); 
	int howManyIndexes = reader.nextInt(); 
	for(int x = 0; x < howManyIndexes; x++) {
		System.out.println("Next number: ");
		myStack.push(reader.nextInt()); 
	}
	System.out.println(myStack);
	System.out.println(letsSortStack(myStack)); 
	
	}
}
