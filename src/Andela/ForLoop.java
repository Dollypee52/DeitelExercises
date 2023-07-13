package Andela;

public class ForLoop {
    public static void main(String[] args) {

        for(int i=2; i<9; i++){
            System.out.println("10,000 at " + i +"% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        // String.format("%.2f) is to format to 2 decimal places
            }
        System.out.println("######################################");
        for(int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
    }
    public static double calculateInterest(double amount, double interest){

        return(amount *(interest/100));
    }


}
