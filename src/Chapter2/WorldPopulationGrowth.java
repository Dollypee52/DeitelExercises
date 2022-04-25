package Chapter2;

import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value for world population");
        double worldPoulation = input.nextDouble();

        System.out.println("Enter value for annual growth rate");
        double annualGrowthRate = input.nextDouble();

        double estimatedPopulation1 = (worldPoulation * annualGrowthRate) + worldPoulation;
        System.out.println("The population for year one is:" +estimatedPopulation1);

        double estimatedPopulation2 = estimatedPopulation1 * annualGrowthRate + worldPoulation;
        System.out.println("The population for year two is:" +estimatedPopulation2);

        double estimatedPopulation3 = estimatedPopulation2 * annualGrowthRate + worldPoulation;
        System.out.println("The population for year three is:" +estimatedPopulation3);

        double estimatedPopulation4 = estimatedPopulation3 * annualGrowthRate + worldPoulation;
        System.out.println("The population for year four is:" +estimatedPopulation4);

        double estimatedPopulation5 = estimatedPopulation4 * annualGrowthRate + worldPoulation;
        System.out.println("The population for year five is:" +estimatedPopulation5);
        
    }
}
