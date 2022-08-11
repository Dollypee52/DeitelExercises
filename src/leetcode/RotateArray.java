package leetcode;
//Rotate an array of n elements to the right by k steps. For example, with n
//= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//How many different ways do you know to solve this problem?
public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        int temp = array[2];
        for(int i =3; i< array.length; i++ ){
            array[i - 1] = array[i];
            array[array.length -1] = temp;
        }
        System.out.println(array);

    }
}
