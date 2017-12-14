import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedStack {

    static String isBalanced(String s) {
        Stack<String> stacky = new Stack<String>(); 
        Stack<String> stacky2 = new Stack<String>(); 
        for(int x=0; x<s.length(); x++) {
            String str = s.substring(x, x+1); 
            if(str.equals("(") || str.equals("{") || str.equals("[")){
                stacky.push(str); 
            }
            else stacky2.push(str); 
        }
        boolean isTrue = true; 
        for(int i=0; i<s.length()/2; i++) {
        		if(stacky.peek().equals("{") && stacky2.peek().equals("}") || stacky.peek().equals("(") && stacky2.peek().equals(")") || stacky.peek().equals("[") && stacky2.peek().equals("]")){
        			stacky.pop(); 
        			stacky2.pop(); 
        }
        		else isTrue = false; 
       }
        if(isTrue = false) {
        	return "NO";  }
        
        	else return "YES"; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many strings: ");
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        		System.out.println("Enter string: ");
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}

