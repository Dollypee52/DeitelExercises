package Exercises;

public class triangle {
    public static void main(String[] args) {
        int n = 5;
//        //square
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //right angle triangle
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//        //decreasing triangle
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//
//        for (int row = 1; row <= n; row++) {
//            for (int column = 1; column <= row; column++) {
//                System.out.print("  ");
//            }
//            for (int column = row; column <= n; column++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int row = 1; row <= n; row++) {
//            for (int column = row; column <= n; column++) {
//                System.out.print("  ");
//            }
//            for (int column = 1; column <= row; column++) {
//                System.out.print("* ");;
//            }
//            System.out.println();
//        }

//        for (int row = 1; row <= n; row++) {
//            for (int column = 1; column <= row; column++) {
//                System.out.print("* ");
//            }
//            for (int columnm = row; columnm <= n; columnm++) {
//                System.out.print("  ");
//            }
//            for (int columnm = row; columnm <= n; columnm++) {
//                System.out.print("  ");
//            }
//            for (int column = 1; column <= row; column++) {
//                System.out.print("* ");
//            }
//            for (int column = 1; column <= row; column++) {
//                System.out.print("  ");
//            }
//            for (int columnm = row; columnm <= n; columnm++) {
//                System.out.print("* ");
//            }
//            for (int columnm = row; columnm <= n; columnm++) {
//                System.out.print("  ");
//            }
//            for (int column = 1; column <= row; column++) {
//                System.out.print("  ");
//            }
//            for (int columnm = row; columnm <= n; columnm++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print(" ");
            }
            for (int column =1; column <=row; column++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

