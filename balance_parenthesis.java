// Problem Statement
//1. A program that will determine whether a set of parenthesis ((,{) is balance or not

import java.util.Scanner;
import java.util.Stack;

public class balance_parenthesis {
    
    //Creating a method to check whether the input string is balanced or not
    @SuppressWarnings({"rawtypes", "unchecked" })
    public static boolean Balanceparenthesis(String inputStr) {
    
        // Create an empty stack
        Stack stack = new Stack();

        // convert inputStr to char array
        char[] charArray = inputStr.toCharArray();

        // iterate charArray
        for (int i = 0; i < charArray.length; i++){
            
            //get char
            char current = charArray[i];

            // check whether current is '('. '[' or '{'
            if (current == '{' || current == '[' || current == '('){
                // push current to stack
                stack.push(current);
                continue;
            }
            // if stack is empty, return false
            if (stack.isEmpty()){
                return false;
            }
            // use switch statement to pop element from stack and if it is '('. '[' or '{', return false
            char popChar;
            switch (current){
                case ')':
                popChar = (char) stack.pop();
                if (popChar == '{' || popChar == '[')
                    return false;
                break;
                case '}':
                popChar = (char) stack.pop();
                if (popChar == '(' || popChar == '[')
                    return false;
                break;
                case ']':
                popChar = (char) stack.pop();
                if (popChar == '(' || popChar == '{')
                    return false;
                break;
            }
        }
        return(stack.isEmpty());
    }
    // main() method start

    public static void main(String[] args){
        String inputStr;

        // create an instance of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter input string to check:");
        inputStr = sc.nextLine();

        // call Balanceparenthesis() method to check wether input string is balanced or not
        if (Balanceparenthesis(inputStr))
            System.out.println("Your Input String"+inputStr+" is balanced.");
        else
            System.out.println("Your Input String"+inputStr+" is not balanced.");
        
        sc.close();

    }
}