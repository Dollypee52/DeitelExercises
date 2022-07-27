package Exercises;

public class ArrayProbs {
    public static void main(String[] args) {
        double[] array = {2.1,1.1,3.1,4.2,5.3,6.4,7.5,8.6,9.7,5.5};
        double sumOfFirstAndSecond = array[0] + array[1];
        System.out.println("sumOfFirstAndLast is: " +sumOfFirstAndSecond);
        double sum = 0;

        for(int i=0; i<array.length; i++){
            sum += array[i];

        }
        System.out.println("the sum of array is: " +sum);

        double min = array[0];
         for(int i =0; i< array.length; i++){
             if(array[i]<min)
                 min = array[i];

         }
        System.out.println("minimum element is: " +min);


         for(int i=0; i<array.length;  i++){
             double index = (Math.random() * array.length);
             double temp = array[i];
             array[i] = array[(int) index];
             array[(int) index] = temp;

         }
        System.out.println(array);
    }
}
