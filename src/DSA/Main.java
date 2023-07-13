package DSA;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<String>();

        stack.push("minecraft");
        stack.push("skyrim");
        stack.push("doom");
        stack.push("templerun");
        stack.push("subway");

        stack.pop();
        stack.pop();

       System.out.println(stack);


    }
}
