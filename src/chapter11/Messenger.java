package chapter11;

import java.io.IOException;
import java.util.InputMismatchException;

public class Messenger {
    public Beans buyBeans(int amount, boolean withOmiEwa, boolean isFake) {
        try {
            return sendSomebodyElse(amount, withOmiEwa, isFake);
        } catch (IOException e) {
            throw new InputMismatchException("something else");
        }
    }

        private Beans sendSomebodyElse ( int amount, boolean withOmiEwa, boolean isFake) throws IOException {
            if (amount < 50) throw new IOException("You no get money abi");
            if (isFake) throw new IllegalArgumentException("Your money be fake ah");
            return new Beans(amount, withOmiEwa);
        }
    }

