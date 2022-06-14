package chapter11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Messenger yahooMessenger = new Messenger();
        try {
            Beans beans = yahooMessenger.buyBeans(49, false, true);
            System.out.println(beans);

        }
        catch (Exception y){
            System.out.println(y.getMessage());
        }
    }
}
