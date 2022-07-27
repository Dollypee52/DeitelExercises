package Chapter5;

public class Elements {
    public static void main(String[] args) {
        int[] elements = new int[300];
        for (int i = 0; i <= 299; i++) {
           elements[i]=i+1;

           System.out.printf("%d ", elements[i]);
        elements[i]++;
        }
    }
}
