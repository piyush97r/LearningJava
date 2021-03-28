package com.arraysandarraylists;
import java.util.*;

public class Stacks {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {

        for(int i=0;i<4;i++){
            if(!stack.isEmpty()){
                stack.pop();
            }else{
                System.out.println("There are not enough elements in the stack");
            }
        }
        if(!stack.isEmpty()){
            System.out.println(stack.pop());
        }else{
            System.out.println("There are not enough elements in the stack");
        }

    }
}