package Chapter8.chapter5;

public class milestoKilometers {
    public static void main(String[] args) {
        double milePerKilometer = 1.609;

        System.out.println("Miles      Kilometers");

        for(int i = 1; i<=10; i++)
            System.out.printf(
                    "%-14d%6.3f\n", i,(i * milePerKilometer));
    }
}
