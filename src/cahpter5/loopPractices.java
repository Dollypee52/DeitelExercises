package cahpter5;


import java.security.SecureRandom;

public class loopPractices {

    public static void main(String[] args) {
        //infinite loop
        //   for(;;){
        //      System.out.print("print infinitely");
        //  }
        SecureRandom random = new SecureRandom();

        int count = 0;
        for (; count <= 4; ) {
            System.out.print("Asherflo");


            count = random.nextInt(20);
        }
    }
}

