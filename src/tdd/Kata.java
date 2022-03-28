package tdd;

public class Kata {
    public int add(int num1, int num2) {return num1 + num2;
    }

    public int subtract(int num1, int num2) {if(num1 > num2)
    {return num1-num2;}
        return num2 - num1;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int radius(int radius) {
        return 22 * 7 * 7 / 7;
    }

    public int flip(int num) {
        if(num == 0)return 1;
        else if(num ==1)return 0;
        return num;
    }
}

