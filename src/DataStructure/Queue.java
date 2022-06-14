package DataStructure;

public class Queue {
    private boolean isEmpty;
    private int counter;
    private String[] queue = new String[5];

    public boolean isEmpty() {
        if(counter <= 0) return true;
        else return false;
    }

    public void Push(String item) {
        queue[counter]= item;
        counter++;


        
    }

    public int getNoOfitem() {
        return counter;


    }

    public String peek() {
            return queue[counter - 1];
    }

    public String pop() {
        counter--;
        String remove = queue[0];
        for (int i = 0; i < queue.length-1; i++) {
            queue[i] = queue[i + 1];

        }
        return remove;

    }
}
