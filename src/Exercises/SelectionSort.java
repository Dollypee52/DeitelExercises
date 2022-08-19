package Exercises;

public class SelectionSort {
    public static void main(String[] args) {

    }

    public static void selectionSort(double[] list){
        for(int i=0; i < list.length-1; i++){
            double currentMin = list[i];
            int currentMInIndex = i;

            for(int j = i+1; j < list.length;j++){
                if(currentMin > list[j]) {
                    currentMin = list[j];
                    currentMInIndex = j;
                }
            }
            if(currentMInIndex !=i){
                list[currentMInIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
