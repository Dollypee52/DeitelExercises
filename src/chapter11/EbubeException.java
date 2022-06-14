package chapter11;

import java.io.IOException;

public class EbubeException extends RuntimeException {
    public EbubeException(){

    }
    public EbubeException(String message){
        super (message);
    }

    public EbubeException(String message, IOException e) {

        super(message, e);
    }

}
