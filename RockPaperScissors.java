import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{
  public static void main ( String[] args){
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    int wins = 0;
    int games = 0;

    System.out.println("C'mon, choose Rock (1), Paper (2), or Scissors (3)");
    int userInput = scan.nextInt();


    while(userInput != 0){
      int computerInput = rand.nextInt(3) + 1;
      String userChoice = "";
      String computerChoice = "";


      if(userInput == 1){
        userChoice = "Rock";
        System.out.println("You chose rock!");
      }
        else if(userInput == 2){
        userChoice = "Paper";
        System.out.println("You chose paper!");
      }
        else if(userInput == 3){
       userChoice = "Scissors";
       System.out.println("You chose scissors!");
      }
      userInput = scan.nextInt();

      System.out.println("The computer chose:" int computerInput);
      if(computerInput == 1){
        computerChoice = "Rock";
        System.out.println("The computer chose rock!");
     }
        else if(computerInput == 2){
       computerChoice = "Paper";
       System.out.println("The computer chose paper!");
    }
    if(computerInput == 3){
      computerChoice = "Scissors";
      System.out.println("The computer chose scissors!");
   }
      }
    }
  }
