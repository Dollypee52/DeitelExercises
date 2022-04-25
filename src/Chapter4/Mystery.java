package Chapter4;

public class Mystery {
    public static void main(String[] args) {
        int x = -2;
        int total = 0;
       // int y = x + 2;

        while (x <= 10){
       // for(x = 0; x <= 10;x++){
           int y = x + 2;
           x++;
            total += y;
            System.out.printf("Y is: %d and total is %d\n", y, total);
//
        }
    }
}
