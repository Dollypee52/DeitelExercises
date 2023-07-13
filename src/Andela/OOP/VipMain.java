package Andela.OOP;

public class VipMain {
    public static void main(String[] args) {

        VipCustomer customer= new VipCustomer();
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        VipCustomer customer2 = new VipCustomer(50.00,"josh@email.com");
        System.out.println(customer2.getEmailAddress());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Moses",100.00,"moses@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());
    }
}
