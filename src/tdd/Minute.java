package tdd;

public class Minute {
    public int years(int digits) {
        int year = 0;
        if (digits / 525600 >=1){

            year = (digits / 525600);

        }
        return  year;
    }
}
