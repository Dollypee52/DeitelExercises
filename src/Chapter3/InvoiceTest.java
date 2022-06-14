package Chapter3;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("AE24D", "Toiletris", 5,100.00);
        System.out.println("The item picked is: " +invoice.getPartDescription());
        System.out.println("The partNumber of item picked is: " + invoice.getPartNumber());
        System.out.println("The invoiceAmount is: " +invoice.getInvoiceAmount());


    }
}
