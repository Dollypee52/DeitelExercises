package DSA;

public class Stack {
        int numberOfElements;
        int[] elements = new int[10];

        public boolean isEmpty() {
            if (numberOfElements == 0) return true;
            else return false;
        }

        public void push(int element) {
            elements[numberOfElements] = element;
            numberOfElements++;
        }

        public int pop() {
            numberOfElements--;
            return elements[numberOfElements];
        }

        public int peek() {
            return elements[numberOfElements--];
        }
    }



