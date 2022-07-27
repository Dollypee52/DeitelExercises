package leetcode;

import static java.lang.Math.pow;

public class Power {

    public static void main(String[] args) {

       myPow(3,2);
    }


        public static double myPow( double x, int n){
            if (n == 0)
                return 1;

            double v = pow(x, n / 2);

            if (n % 2 == 0) {
                return v * v;

            } else {
                return v * v * x;
            }
        }

        public static double pow ( double x, int n){
            if (n < 0) {
                return 1 / pow(x, -n);
            } else {
                return pow(x, n);
            }
        }


    }



