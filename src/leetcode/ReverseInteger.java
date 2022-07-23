package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        reverse(123);
        System.out.println(reverse(321));
    }

    public static int reverse(int x) {
        int num = 0;
        while (x != 0) {
            num = num * 10 + x % 10;
            x = x / 10;
        }
        return num;
    }
}
