package Chapter3;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Lagos","diesel",5,162.5,0.06);
        PetrolPurchase petrolPurchase1 = new PetrolPurchase("kerosene",4,0.05);
        System.out.println("The price is "+petrolPurchase.getPrice());
        System.out.println("The  Location is "+petrolPurchase.getStationsLocation());
        System.out.println("The petrol purchase amount "+petrolPurchase.getPurchaseAmount());

       petrolPurchase1.setPrice(154.7);
       petrolPurchase1.setPetrolType("good");
        System.out.println("The price is "+petrolPurchase1.getPrice());
        System.out.println("The  Location is "+petrolPurchase1.getPetrolType());




    }

}
