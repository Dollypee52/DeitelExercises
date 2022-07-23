package DataStructure;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {5, 4, 4, 2, 2, 8};

        int lastUnsortedIndex;
        for (lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) ;
        for (int i = 0; i < lastUnsortedIndex; i++) {
            if (intArray[i] > intArray[i + 1]) {
                swap(intArray, i, i + 1);
            }
        }
         
    }



    private static void swap(int[] array, int i, int j) {
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i]= array[j];
        array[j] = temp;
    }
}


