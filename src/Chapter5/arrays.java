package Chapter5;
//
public class arrays {
    public static void main(String[] args) {
        String[][] ticTac = new String[3][3];

        ticTac[0][0]="X";
        ticTac[0][1]="O";
        ticTac[0][2]="X";
        ticTac[1][0]="X";
        ticTac[1][1]="X";
        ticTac[1][2]="X";
        ticTac[2][0]="O";
        ticTac[2][1]="X";
        ticTac[2][2]="O";

        System.out.printf("%s  %s  %s%n",ticTac[0][0],ticTac[0][1],ticTac[0][2]);
        System.out.printf("%s  %s  %s%n",ticTac[1][0],ticTac[1][1],ticTac[1][2]);
        System.out.printf("%s  %s  %s%n",ticTac[2][0],ticTac[2][1],ticTac[2][2]);

    }
}
