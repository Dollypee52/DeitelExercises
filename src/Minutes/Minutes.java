package Minutes;

import java.util.Scanner;

public class Minutes {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the number of minutes");
  int minutes = input.nextInt();

  int years = minutes / (60 * 24 * 365);
  int minuteRemaining = minutes % 24 * 60 * 365;
  int days = minuteRemaining / (60 * 24);

  System.out.println(minutes + " minutes is approximately" + years + " years" + days + " days");
 }
}