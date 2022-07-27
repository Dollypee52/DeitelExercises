package HackerrankExercises;

public class SimpleArraySum {
    public static void main(String[] args) {
        int[] array = {6,7,8,5,7,9,3};
        int sum = 0;

        for(int i=0; i< array.length;i++){
            sum += array[i];

        }
        System.out.println(sum);


    }
}
