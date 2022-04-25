package Chapter3;

public class PetrolPurchase {
    private String stationsLocation;
    private String petrolType;
    private int quantity;
    private double price;
    private double percentageDiscount;

    public PetrolPurchase(String stationsLocation, String petrolType, int quantity, double price, double percentageDiscount) {
        this.stationsLocation = stationsLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.price = price;
        this.percentageDiscount = percentageDiscount;
    }

    public PetrolPurchase(String petrolType, int quantity, double price){
        this("Ikeja",petrolType,quantity,price,0.6);
    }

    public PetrolPurchase(int quantity, double price){
        this("Ikeja","good",quantity,price,0.6);
    }

    public String getStationsLocation() {
        return stationsLocation;
    }

    public void setStationsLocation(String stationsLocation) {
        this.stationsLocation = stationsLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPurchaseAmount(){
        return ((quantity * price) - percentageDiscount);
    }



}


