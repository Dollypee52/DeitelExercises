package Chapter2;

public class Main {

    public static void main(String[] args) {

        VipCustomer governor = new VipCustomer();
        System.out.println(governor.getCreditLimit());

        VipCustomer governor2 = new VipCustomer("Bob", 45.00);
        System.out.println(governor2.getName());

        VipCustomer governor3 = new VipCustomer("Dola", 95.00, "dol@email.com");
        System.out.println(governor3.getName());
        System.out.println(governor3.getEmail());

    }
}
