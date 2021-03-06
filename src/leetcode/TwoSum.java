package leetcode;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {4,5,9,7};
        twoSum(array,14);
        System.out.println(twoSum(array,4));
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index + 1;
                result[1] = i + 1;
                break;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return result;
    }
}

