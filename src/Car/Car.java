package Car;

public class Car {

    private String carModel;
    private String carYear;
    private double carPrice;


    public Car(String carModel, String carYear, double carPrice) {
        this.carModel = carModel;
        this.carYear = carYear;
        if(carPrice > 0) {
            this.carPrice = carPrice;
        }
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarYear(String carYear) {

        this.carYear = carYear;
    }

    public String getCarYear() {

        return carYear;
    }

    public void setCarPrice(double carPrice) {
        if(carPrice > 0) {
            this.carPrice = carPrice;
        }
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setDiscount(double discount) {
        carPrice = carPrice - (carPrice * discount);
    }
}
