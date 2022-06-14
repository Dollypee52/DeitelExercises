package Chapter3;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfItem;
    private double pricePerItem;

  public Invoice(String partNumber, String partDescription, int quantityOfItem, double pricePerItem){
      this.partNumber = partNumber;
      this.partDescription = partDescription;
      this.quantityOfItem = quantityOfItem;
      this.pricePerItem = pricePerItem;


  }


    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        this.quantityOfItem = quantityOfItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public double getInvoiceAmount(){
      return (quantityOfItem * pricePerItem);
    }
}
