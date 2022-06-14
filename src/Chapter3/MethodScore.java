package Chapter3;

import tdd.AirConditioner;

import java.util.Scanner;

public class MethodScore {
  static boolean gameOver = true;
  static final Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

   calculateScore(800,5,100);
   calculateScore(3000,8,200);
   calculateScore(5000,12,200);

  }
public static void calculateScore(int score, int levelCompleted, int bonus){
    if (gameOver){
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Final score = "+finalScore);

    }
}




}
